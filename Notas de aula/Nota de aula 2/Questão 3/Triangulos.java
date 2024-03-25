public class Triangulos {
    
    double lado_1, lado_2, lado_3; 

        public double getLado_1() {
            return this.lado_1;
        }

        public void setLado_1(double lado_1) {
            this.lado_1 = lado_1;
        }

        public double getLado_2() {
            return this.lado_2;
        }

        public void setLado_2(double lado_2) {
            this.lado_2 = lado_2;
        }

        public double getLado_3() {
            return this.lado_3;
        }

        public void setLado_3(double lado_3) {
            this.lado_3 = lado_3;
        }

    public void desc_Triangulo(){ 

        if (lado_1 == lado_2 && lado_2 == lado_3) { 
            
            System.out.println("É um triangulo equilatero."); 

        }

        else if (lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3){ 
          
            System.out.println("É um triangulo isosceles."); 

        }

        else{

            System.out.println("É um triangulo escaleno."); 

        }

    }

}
