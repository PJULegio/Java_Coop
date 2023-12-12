public class Palindrome
{
    public static void main(String[] args)
    {
        boolean palindrome = true;
        //int[] tab = {1,2,3,4,4,3,2,1};
        int[] tab = {1,2,3,4,5,3,2,1};

        for (int i = 0; i < tab.length/2; i++) {
            // Dla i = 0, ( tab[i] != tab[tab.length-1-i] ), równa się ( tab[0] != tab[7] )
            // Dla tablicy 8-elementowej nie istnieje tab[8]
            if(tab[i] != tab[tab.length-1-i]){
                palindrome = false;
            }
        }
        System.out.println(palindrome);
    }
}

/*  (tab.length / 2) żeby się nie powtarzać
    (tab.length) porównałby elementy 8 razy
    tab[0] i tab[7]
    tab[1] i tab[6]
    tab[2] i tab[5]
    tab[3] i tab[4]
    tab[4] i tab[3] tu zaczynamy się powtarzać
    tab[5] i tab[2]
    tab[6] i tab[1]
    tab[7] i tab[0]

    (tab.length / 2) porówna elementy 4 razy
    tab[0] i tab[7]
    tab[1] i tab[6]
    tab[2] i tab[5]
    tab[3] i tab[4]
    Wystarczy, wszystkie elementy porównane
 */