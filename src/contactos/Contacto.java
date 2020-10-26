
package contactos;

class Contacto {
    
    private String nombre, telefono, email;
    private int posicion; 
    
    public Contacto(String nombre, String telefono, String email, int posicion){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this. posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nContacto (" + (posicion+1) + "):"
                + "\n-Nombre = " + nombre 
                + "\n-Teléfono = " + telefono 
                + "\n-Email = " + email + '}';
    }
}
