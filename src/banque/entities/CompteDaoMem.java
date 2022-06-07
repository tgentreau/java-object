package banque.entities;

import java.util.ArrayList;

public class CompteDaoMem implements CompteDao{
    private ArrayList<Compte> comptes = new ArrayList<>();

//    public CompteDaoMem(int numCompte, int soldeCompte, int tauxRemun, ArrayList<Compte> comptes) {
//        super(numCompte, soldeCompte, tauxRemun);
//        this.comptes = comptes;
//    }

    @Override
    public ArrayList<Compte> lister() {
        return this.comptes;
    }

    @Override
    public void sauvegarder(Compte nvCompte) {
        this.comptes.add(nvCompte);
    }

    @Override
    public boolean supprimer(String numero) {
        boolean state = false;
        Compte compteSuppr = null;
        for (Compte compte : this.comptes) {
            if(compte.numCompte.equals(numero)) {
                compteSuppr = compte;
                state = true;
            }
        }
        if(compteSuppr != null) {
            this.comptes.remove(compteSuppr);
        }
        return state;
    }

    @Override
    public boolean existe(String numero) {
        boolean state = false;
        for (Compte compte : this.comptes) {
            if(compte.numCompte == numero) {
                state = true;
            } else {
                state = false;
            }
        }
        return state;
    }

    @Override
    public Compte getCompte(String numero) {
        return this.comptes.get(Integer.parseInt(numero));
    }
}
