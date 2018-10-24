public class TestSynchronizedBuss {
    public static void main(String arg[]){
        BussMetorTickts bssCompyn=new BussMetorTickts();
        PassngerTickte member1=new PassngerTickte(1, bssCompyn, "Gopal je");
        PassngerTickte member2=new PassngerTickte(2, bssCompyn, "krne je");
        PassngerTickte member3=new PassngerTickte(1, bssCompyn, "khe je");
        member3.start();
        member2.start();
        member1.start();
    }
}
