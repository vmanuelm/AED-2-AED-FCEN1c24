package aed;

class Funciones {
    int cuadrado(int x) {
            int res = x * x;
            return res;
        }

    double distancia(double x, double y) {
        double sumaCatetosCuadrados = x*x + y*y;
        double res = Math.sqrt(sumaCatetosCuadrados);
        return res;
    }

    boolean esPar(int n) {
        return n % 2 == 0;
    }


    boolean esBisiesto(int n) {
        return n%4 == 0 && (n % 100 !=0 || n % 400 == 0);
    }

    int factorialIterativo(int n) {
        int factorial = 1;
        for(int i = 1; i <= n ; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    int factorialRecursivo(int n) {
        int factorial = 0;
        if(n == 0){
            return 1;            
        } else {
            factorial = n * factorialRecursivo(n-1);
        }
        return factorial;
    }

    boolean esPrimo(int n) {
        int cantDivisores = 0;
        if(n==0){
            return false;
        } else if (n == 1){
            return false;
        } else {
            for(int i = 1; i<=n;i++){
                if(n%i==0){
                    cantDivisores +=1;
                }
            }
        }
        return cantDivisores <= 2;
    }

    int sumatoria(int[] numeros) {
        int sumatoria = 0;
        for(int i = 0; i < numeros.length; i++){
            sumatoria = sumatoria + numeros[i];
        }
        return sumatoria;
    }

    int busqueda(int[] numeros, int buscado) {
        int posicion = 0;
        for(int i = 0; i < numeros.length; i++){
            if(buscado == numeros[i]){
                posicion = i;
            }
        }
        return posicion;
    }

    boolean tienePrimo(int[] numeros) {
        for(int i = 0; i< numeros.length;i++){
            if(esPrimo(numeros[i])){
                return true;
            } 
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        boolean res = true;
        int contadorDeImpares = 0;
        for(int i = 0; i< numeros.length;i++){
            if(esPar(numeros[i])){
                contadorDeImpares += 0;
            } else {
                contadorDeImpares += 1;
            }
        }
        if(contadorDeImpares > 0){
            res = false;
        }
        return res;
    }

    boolean esPrefijo(String s1, String s2) {
        boolean res = true;
        int coincidencias = 0;
        if(s1.length()<= s2.length()){
            for(int i = 0; i < s1.length();i++){
                if(s1.charAt(i) == s2.charAt(i)){
                    coincidencias += 1;
                }
            }
        }
        if(coincidencias < s1.length()){
            res = false;
        }
        return res;
    }

    String cadenaAlReves(String s1){
        String palabra = "";
        for (int i = s1.length()-1; i >= 0 ;i--){
            palabra = palabra + s1.charAt(i);
        }
        return palabra;
    }

    boolean esSufijo(String s1, String s2) {

        String s1AlReves = cadenaAlReves(s1);
        String s2AlReves = cadenaAlReves(s2);
        boolean res = esPrefijo(s1AlReves, s2AlReves);
        return res;
    }

}
