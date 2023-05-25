package com.tfg.supportbank.util;

public enum EnumPreguntaSeguridad {
    
    NOMBRE_MASCOTA("¿Nombre de tu primera mascota?"),
    NOMBRE_COLEGIO("¿Nombre de tu primer colegio?"),
    COMIDA_FAVORITA("¿Comida favorita?"),
    COLOR_FAVORITO("¿Color favorito?");
    
    
    private String pregunta;

    private EnumPreguntaSeguridad(String pregunta) {
        this.pregunta = pregunta;
    }

    
    public String getPregunta() {
        return pregunta;
    }
    
    
}
