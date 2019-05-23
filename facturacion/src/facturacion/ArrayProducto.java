package facturacion;

import java.util.ArrayList;
public class ArrayProducto {
    private ArrayList<Producto> listaProducto;
    
    public ArrayProducto(){
        listaProducto = new ArrayList<>();
    }
    
    public void adicionarProduccto(Producto objeto){
        listaProducto.add(objeto);
    }
    public void eliminarProducto(Producto objeto){
        listaProducto.remove(objeto);
    }
    public Producto elementoPosicion(int posicion){
        return listaProducto.get(posicion);
    }
    public Producto consultarCodigo(String codigo){
        for (int i = 0; i < listaProducto.size(); i++) {
            if(listaProducto.get(i).getCodigo().equals(codigo)){
                return listaProducto.get(i);
            }
        }
        return null;
    }
    public int cantidadProducto(){
        return listaProducto.size();
    }
    public Producto productoMasCaro(){
        Producto conector=listaProducto.get(0);
        for (int i = 0; i < listaProducto.size(); i++) {
            if(listaProducto.get(i).getPrecio()>conector.getPrecio()){
                conector=listaProducto.get(i);
            }
        }
        return conector;
    }
    public Producto productoMasBarato(){
        Producto conector=listaProducto.get(0);
        for (int i = 0; i < listaProducto.size(); i++) {
            if(listaProducto.get(i).getPrecio()<conector.getPrecio()){
                conector=listaProducto.get(i);
            }
        }
        return conector;
    }
}
