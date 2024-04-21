package Principal;

import Pessoas.Pessoas;
import ProgramTV.ProgramaTV;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList <ProgramaTV> programas = new ArrayList <ProgramaTV>();

        ProgramaTV p = new ProgramaTV(001,"O outro lado do paraíso","Novela");
        p.diretor = new Pessoas("Diretor 1", "Brasileiro");
        p.setArtistas(new Pessoas("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoas("Artista 2", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV(002,"Orgulho e Paixão","Novela");
        p.diretor = new Pessoas("Diretor 2", "Brasileiro");
        p.setArtistas(new Pessoas("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoas("Artista 4", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV(003,"Marley e eu","Filme");
        p.diretor = new Pessoas("Diretor 3", "Brasileiro");
        p.setArtistas(new Pessoas("Artista 5", "Brasileiro"));
        p.setArtistas(new Pessoas("Artista 6", "Brasileiro"));
        programas.add(p);

        p = new ProgramaTV(004,"Show Ivete Sangalo","Show");
        p.diretor = new Pessoas("Diretor 4", "Brasileiro");
        p.setArtistas(new Pessoas("Artista 7", "Brasileiro"));
        p.setArtistas(new Pessoas("Artista 8", "Brasileiro"));
        programas.add(p);


        for (int i=0;i<programas.size();i++) {
            System.out.println(programas.get(i));
        }

    }

}
