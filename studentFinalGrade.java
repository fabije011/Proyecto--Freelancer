//Crea una función finalGrade, que calcula la nota final de un alumno en función de dos parámetros: una nota del examen y un número de proyectos completados.

//Esta función debe tomar dos argumentos: examen - calificación del examen (de 0 a 100); proyectos - número de proyectos completados (de 0 en adelante);
// 100, si la nota del examen es superior a 90 o si el número de proyectos completados es superior a 10.
//90, si la nota del examen es superior a 75 y si el número de proyectos completados es mínimo 5.
//75, si la nota del examen es superior a 50 y si el número de proyectos completados es mínimo 2.
//0, en otros casos

public class StudentFinalGrade{
    
    public static int finalGrade(int exam, int projects){
        
    if (exam >90 || projects >10){
      return 100;  
    }
     else if(exam >75 && projects >=5){
       return 90;
     }
      else if (exam >50 && projects >=2){
        return 75;
      }
        else {
         return 0;
       }
      
  }
           
}
