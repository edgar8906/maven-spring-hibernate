package com.campitos.spring.web;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorUsuario {
    
    //DEFINIMOS LA DE BUSCAR TODOS
    @RequestMapping(value="/usuario", method=RequestMethod.GET, headers={"Accept=Application/json"})
    
    public @ResponseBody String metodo1() throws Exception{
        ObjectMapper maper=new ObjectMapper();
        
        DAOUsuarioImpl d=new DAOUsuarioImpl();
        return maper.writeValueAsString(d.buscarTodosClientes());
    }
    
    //SIGUE EL DE INSERTAR USUARIO, LO HAREMOS SIGUIENDO LA CONVENCION DE REST PARA SERVICIOS
    @RequestMapping(value="/usuario/{nombre}/{sueldo}", method=RequestMethod.GET, headers={"Accept=tet/html"} )
    
    public @ResponseBody String metodo2(@PathVariable String nombre, @PathVariable float sueldo){
        
        DAOUsuarioImpl d=new DAOUsuarioImpl();
        d.agregarProducto(new Usuario(1, nombre, sueldo));
        return "USUARIO AGREGADO CON EXITO";
    } 
    
    
}
