package Aplicação;

import Entidades.Local;
import Entidades.Usuario;
import Entidades.Viagem;
import Entidades.ViagemATrabalho;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();

        char cadastrarUsuario;

        do {
            cadastrarUsuario = JOptionPane.showInputDialog("Cadastrar novo usuário (S/N)?").toUpperCase().charAt(0);

            if (cadastrarUsuario == 'S') {
                String nome = JOptionPane.showInputDialog("Nome do usuário:");
                String email = JOptionPane.showInputDialog("Email do usuário:");
                String senha = JOptionPane.showInputDialog("Senha do usuário:");

                Usuario usuario = new Usuario(nome, email, senha);

                char cadastrarViagem;

                do {
                    cadastrarViagem = JOptionPane.showInputDialog("Cadastrar nova viagem para o usuário (S/N)?").toUpperCase().charAt(0);

                    if (cadastrarViagem == 'S') {
                        String descricao = JOptionPane.showInputDialog("Descrição da viagem:");
                        Viagem viagem;


                        char tipoViagem = JOptionPane.showInputDialog("Viagem à trabalho (T) ou de férias (F)?").toUpperCase().charAt(0);

                        if (tipoViagem == 'T') {
                            String nomeEmpresa = JOptionPane.showInputDialog("Nome da empresa:");
                            double valorPago = Double.parseDouble(JOptionPane.showInputDialog("Valor pago pela empresa:"));
                            viagem = new ViagemATrabalho(descricao, nomeEmpresa, valorPago);

                        } else {
                            viagem = new Viagem(descricao);

                        }
                        viagem.setDataInicio(JOptionPane.showInputDialog("Data de inicio:"));
                        viagem.setDataFim(JOptionPane.showInputDialog("Data de fim:"));

                        char cadastrarLocal;

                        do {
                            cadastrarLocal = JOptionPane.showInputDialog("Cadastrar novo local para a viagem (S/N)?").toUpperCase().charAt(0);

                            if (cadastrarLocal == 'S') {
                                String nomeLocal = JOptionPane.showInputDialog("Nome do local:");
                                String dataLocal = JOptionPane.showInputDialog("Data do local:");

                                Local local = new Local(nomeLocal, dataLocal);

                                local.setHoraInicial(JOptionPane.showInputDialog("Hora inicial:"));
                                local.setHoraFinal(JOptionPane.showInputDialog("Hora final:"));
                                local.setComentario(JOptionPane.showInputDialog("Insira um comentário: "));

                                viagem.adicionarLocal(local);
                            }
                        } while (cadastrarLocal == 'S');

                        usuario.adicionarViagem(viagem);
                    }
                } while (cadastrarViagem == 'S');

                usuarios.add(usuario);
            }
        } while (cadastrarUsuario == 'S');

        StringBuilder usuariosInfo = new StringBuilder();

        for (Usuario usuario : usuarios) {
            usuariosInfo.append(usuario.toString()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, usuariosInfo.toString());
    }
}