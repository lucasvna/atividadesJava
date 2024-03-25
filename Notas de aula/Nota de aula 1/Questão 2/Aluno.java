public class Aluno { 
    
    String nome; 

    Double nota_1;
    Double nota_2;
    Double nota_3;
    Double media;

    public void calcular_media(){ 

        media = (nota_1+nota_2+nota_3) / 3;

    }

}
