package main;

import java.util.Scanner;

// @author mtnot

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num_andar, num_quarto, linha = 4, coluna = 3;
        String[][] quartos = new String[linha][coluna];
        String op, nv_op;

        // primeiro andar
        System.out.println("[1] Primeiro andar:");
        for (int i = 0; i < coluna; i++) {
            quartos[0][i] = "Livre";
            System.out.println("\tQuarto " + (i + 100) + ": " + quartos[0][i]);
        }
        // segundo andar
        System.out.println("[2] Segundo andar:");
        for (int i = 0; i < coluna; i++) {
            quartos[1][i] = "Livre";
            System.out.println("\tQuarto " + (i + 200) + ": " + quartos[1][i]);
        }
        // Terceiro andar
        System.out.println("[3] Terceiro andar:");
        for (int i = 0; i < coluna; i++) {
            quartos[2][i] = "Livre";
            System.out.println("\tQuarto " + (i + 300) + ": " + quartos[2][i]);
        }
        // quarto andar
        System.out.println("[4] Quarto andar:");
        for (int i = 0; i < coluna; i++) {
            quartos[3][i] = "Livre";
            System.out.println("\tQuarto " + (i + 400) + ": " + quartos[3][i]);
        }

        do {
            System.out.print("\nIniciar? (s/n): ");
            op = scan.nextLine();

            if (op.equalsIgnoreCase("s")) {
                do {
                    System.out.print("\nSelecione o andar: ");
                    num_andar = Integer.parseInt(scan.nextLine());
                    num_andar -= 1;

                    if (num_andar < 0 || num_andar > 3) {
                        System.out.println("\n\t[Andar inválido]");
                    } else {
                        if (num_andar == 0) {
                            System.out.print("Selecione o quarto: ");
                            num_quarto = Integer.parseInt(scan.nextLine());
                            num_quarto -= 100;

                            if (num_quarto < 0 || num_quarto > 2) {
                                System.out.println("\n\t[Quarto inválido]");
                            } else {
                                if (quartos[0][num_quarto].equalsIgnoreCase("livre")) {
                                    quartos[0][num_quarto] = "Ocupado";
                                    System.out.println("\n\tQuarto \"" + (num_quarto + 100) + "\" do andar \""
                                            + (num_andar + 1) + "\" agora está ocupado.");
                                } else {
                                    System.out.println("\n\tQuarto \"" + (num_quarto + 100) + "\" do andar \""
                                            + (num_andar + 1) + "\" já se encontra ocupado, selecione outro.");
                                }
                            }

                        } else if (num_andar == 1) {
                            System.out.print("Selecione o quarto: ");
                            num_quarto = Integer.parseInt(scan.nextLine());
                            num_quarto -= 200;

                            if (num_quarto < 0 || num_quarto > 2) {
                                System.out.println("\n\t[Quarto inválido]");
                            } else {
                                if (quartos[1][num_quarto].equalsIgnoreCase("livre")) {
                                    quartos[1][num_quarto] = "Ocupado";
                                    System.out.println("\n\tQuarto \"" + (num_quarto + 200) + "\" do andar \""
                                            + (num_andar + 1) + "\" agora está ocupado.");
                                } else {
                                    System.out.println("\n\tQuarto \"" + (num_quarto + 200) + "\" do andar \""
                                            + (num_andar + 1) + "\" já se encontra ocupado, selecione outro.");
                                }
                            }
                        } else if (num_andar == 2) {
                            System.out.print("Selecione o quarto: ");
                            num_quarto = Integer.parseInt(scan.nextLine());
                            num_quarto -= 300;

                            if (num_quarto < 0 || num_quarto > 2) {
                                System.out.println("\n\t[Quarto inválido]");
                            } else {
                                if (quartos[2][num_quarto].equalsIgnoreCase("livre")) {
                                    quartos[2][num_quarto] = "Ocupado";
                                    System.out.println("\n\tQuarto \"" + (num_quarto + 300) + "\" do andar \""
                                            + (num_andar + 1) + "\" agora está ocupado.");
                                } else {
                                    System.out.println("\n\tQuarto \"" + (num_quarto + 300) + "\" do andar \""
                                            + (num_andar + 1) + "\" já se encontra ocupado, selecione outro.");
                                }
                            }
                        } else if (num_andar == 3) {
                            System.out.print("Selecione o quarto: ");
                            num_quarto = Integer.parseInt(scan.nextLine());
                            num_quarto -= 400;

                            if (num_quarto < 0 || num_quarto > 2) {
                                System.out.println("\n\t[Quarto inválido]");
                            } else {
                                if (quartos[3][num_quarto].equalsIgnoreCase("livre")) {
                                    quartos[3][num_quarto] = "Ocupado";
                                    System.out.println("\n\tQuarto \"" + (num_quarto + 400) + "\" do andar \""
                                            + (num_andar + 1) + "\" agora está ocupado.");
                                } else {
                                    System.out.println("\n\tQuarto \"" + (num_quarto + 400) + "\" do andar \""
                                            + (num_andar + 1) + "\" já se encontra ocupado, selecione outro.");
                                }
                            }
                        }
                    }

                    System.out.println();
                    // primeiro andar
                    System.out.println("[1] Primeiro andar:");
                    for (int i = 0; i < coluna; i++) {
                        System.out.println("\tQuarto " + (i + 100) + ": " + quartos[0][i]);
                    }
                    // segundo andar
                    System.out.println("[2] Segundo andar:");
                    for (int i = 0; i < coluna; i++) {
                        System.out.println("\tQuarto " + (i + 200) + ": " + quartos[1][i]);
                    }
                    // Terceiro andar
                    System.out.println("[3] Terceiro andar:");
                    for (int i = 0; i < coluna; i++) {
                        System.out.println("\tQuarto " + (i + 300) + ": " + quartos[2][i]);
                    }
                    // quarto andar
                    System.out.println("[4] Quarto andar:");
                    for (int i = 0; i < coluna; i++) {
                        System.out.println("\tQuarto " + (i + 400) + ": " + quartos[3][i]);
                    }

                    System.out.print("\nDeseja realizar outra ocupação? (s/n): ");
                    nv_op = scan.nextLine();

                } while (!nv_op.equalsIgnoreCase("n"));

            }

        } while (!op.equalsIgnoreCase("n"));

        System.out.println();
        for (int i = 0; i < quartos.length; i++) {
            for (int j = 0; j < quartos[i].length; j++) {
                if (quartos[i][j].equalsIgnoreCase("ocupado")) {
                    System.out.print("x ");
                } else {
                    System.out.print(quartos[i][j] + " ");
                }
            }
            System.out.println();
        }

        scan.close();

    }

}
