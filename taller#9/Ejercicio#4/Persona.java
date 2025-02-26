public class Persona implements Hablador , Trabajador  {

    @Override
    public void hablar () {
        System.out.println( "la persona esta hablando");

    }

@Override
public void trabaja () {

    System.out.println("la persona esta trabajando");

}


}
