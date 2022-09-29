class Main {
  public static void main(String[] args) {
    int resultadoSuma = suma( 1, 2, 3);
    Coche miCoche = new Coche();

    miCoche.SumarPuerta();
    miCoche.SumarPuerta();
    miCoche.SumarPuerta();
    miCoche.SumarPuerta();
    
    System.out.println( "El resultado de la suma es: " + resultadoSuma );
    System.out.println( "Mi coche tiene: " + miCoche.puertas + " puertas" );
    
  }

  public static int suma( int a, int b, int c){
    return a + b + c;
  }
}

class Coche {
  public int puertas = 0;

  public void SumarPuerta(){
    this.puertas ++;
  }

  }
