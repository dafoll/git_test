import java.lang.String;
import java.util.stream.IntStream;


//appendCodePoint es una metodo de stringbuilder para agregar a un String el caracter en base a su numero de unicode
//StringBuilder es una clase para crear un String mutable
class MicroBlog
{
    public String truncate(String input)
    {
        IntStream stream = input.codePoints().limit(5);
        StringBuilder r;

        r = stream.collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append);

        return r.toString();
    }
}



class main
{
    public static void main(String args[])
    {
        String txt = "\uD83C\uDCCE\uD83C\uDCB8\uD83C\uDCC5\uD83C\uDCCB\uD83C\uDCCD\uD83C\uDCC1\uD83C\uDCCA";

        MicroBlog mb = new MicroBlog();

        System.out.println(mb.truncate(txt));

    }
}