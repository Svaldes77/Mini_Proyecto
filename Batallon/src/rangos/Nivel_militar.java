package rangos; //Paquete de la Clase

// Enumeración que define los niveles militares
public enum Nivel_militar {
    CAPITAN ,       // Nivel de Capitán 
    SOLDADO_RASO,   // Nivel de Soldado Raso
    TENIENTE,       // Nivel de Teniente
    CORONEL         // Nivel de Coronel
}
//  @Override
//     public String toString() {
//         switch (this) {
//             case SOLDADO_RASO: return "Soldado Raso";
//             case TENIENTE: return "Teniente";
//             case CAPITAN: return "Capitán";
//             case CORONEL: return "Coronel";
//             default: throw new IllegalArgumentException();
//         }