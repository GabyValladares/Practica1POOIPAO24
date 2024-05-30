/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Usuario {
    //PUBLICOS->public:Acceso libre
    //PRIVADOS->private:Acceso es posible solo para los miembros de la clase
    //PROTEGIDOS->protected:Si soy una subclase puedo acceder a la información de la clase
    private String nombre;
    private String apellido;
    private char inicial;
    private String direccion;
    private String correoElectronico;
    
    //LLENAR O INICIALIZAR SE LLAMA CONSTRUCTOR
    //MÉTODO VACÍO O CON ARGUMENTOS

    public Usuario() {
    }

    public Usuario(String nombre1, String apellido, char inicial, String direccion, String correoElectronico) {
        //puntero this : es copiar el valor de la variable a la que están apuntando
        this.nombre = nombre1;
        this.apellido = apellido;
        this.inicial = inicial;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }
   
    
    
}
