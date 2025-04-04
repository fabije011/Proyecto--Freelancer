//Como Nathan sabe que es importante mantenerse hidratado, bebe 0,5 litros de agua por cada hora de ciclismo.

//Te dan el tiempo en horas y debes devolver el número de litros que beberá Nathan, redondeado hacia abajo .

public class KeepHydrated  {
  public static int liters(double time)  {    
    int result = (int) (time*0.5); // casting(conversion) conversion de double a int
    return result;
  }
}
