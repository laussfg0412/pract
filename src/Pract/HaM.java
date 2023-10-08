package Pract;

public class HaM {
    private float horas;
public void AsignarDatos(float h) {
    horas = h;
}
public float CalcularMinutos() {
    float minutos;
    minutos = horas * 60;
    return minutos;
}
public float DevolverHoras() {
    return horas;
}
}
