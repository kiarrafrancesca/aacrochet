package crochet;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import user.UserManager;

public class AboutCrochet {
    private UserManager userManager = new UserManager("userData.txt");
    private Scanner input = new Scanner(System.in);
    private List<Tool> tools;
    private List<Yarn> yarns;
    private List<Stitch> stitches;
    private List<Tips> tip;

    public AboutCrochet() {
        this.tools = ToolInitializer.initializeTools();
        this.yarns = YarnInitializer.initializeYarns();
        this.stitches = StitchInitializer.initializeStitches();
        this.tip = TipsInitializer.initializeTips();
    }

    public void displayMenu() {
        boolean exit = false;

        while (!exit) {
            userManager.clearScreen();
            System.out.println("===========================================");
            System.out.println("                 About Crochet             ");
            System.out.println("===========================================");
            System.out.println("              1. Crochet Tools");
            System.out.println("                2. Yarnology");
            System.out.println("              3. Stitch Library");
            System.out.println("             4. Tips and Tricks");
            System.out.println("-------------------------------------------");
            System.out.println("                   5. Exit");
            System.out.println("===========================================");
            System.out.print("  > Enter your choice (1-5): ");
            int choice = 0;

            try {
                choice = input.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid choice from the menu.");
                input.next();
                continue;
            }

            switch (choice) {
                case 1:
                    crochetTools();
                    break;
                case 2:
                    yarnology();
                    break;
                case 3:
                    stitchLibrary();
                    break;
                case 4:
                    tipsAndTricks();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter a valid choice from the menu.");
            }
            input.nextLine();
        }
        input.close();
    }

    public void crochetTools() {
        userManager.clearScreen();
        System.out.println("===============================================================================================");
        System.out.println("                                Welcome to Crochet Tools and Materials");
        System.out.println("===============================================================================================");
        System.out.println("1. Hooks            2. Scissor              3. Stitch Marker            4. Tapestry Needle");
        System.out.println("5. Measuring Tape   6. Yarn Winder          7. Safety Eyes & Nose       8. Stuffing (Polyfill)");
        System.out.println("9. Buttons          10. D-Ring or Buckler   11. Lobsters Claw or Hook");
        System.out.println("12. Keychain Ring (Metal Chain Links or Jump Rings)");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.print("  > Enter the number of the tool you want to learn ('0' to exit): ");

        int toolNumber = -1;

        try {
            toolNumber = input.nextInt();
            input.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice from the list.");
            input.next();
            return;
        }

        if (toolNumber == 0) {
            return;
        }
        else if (toolNumber >= 1 && toolNumber <= 12) {
            Tool tool = tools.get(toolNumber - 1);
            userManager.clearScreen();
            System.out.println("Tool Name: " + tool.getName());
            System.out.println("Description: " + tool.getDescription());
            System.out.println();
            System.out.println("Press 'enter' to return to tools menu.");
            input.nextLine();
            input.nextLine();
            crochetTools();
        }
        else {
            System.out.println("Please enter a valid choice from the list.");
        }
    }

    public void yarnology() {
        userManager.clearScreen();
        System.out.println("====================================================================================");
        System.out.println("                                Welcome to Yarn Library");
        System.out.println("====================================================================================");
        System.out.println("    1. Cotton Yarn              2. Velvet Yarn              3. Indophil Yarn");
        System.out.println("    4. Chunky Yarn              5. Polyester Yarn           6. Acrylic Yarn");
        System.out.println("    7. Chenille Yarn            8. Mohair Yarn              9. T-Shirt Yarn");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("  > Enter the number of the stitch you want to learn ('0' to exit): ");

        int yarnNumber = -1;

        try {
            yarnNumber = input.nextInt();
            input.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice from the list.");
            input.next();
            return;
        }

        if (yarnNumber == 0) {
            return;
        }
        else if (yarnNumber >= 1 && yarnNumber <= 9) {
            Yarn yarn = yarns.get(yarnNumber - 1);
            userManager.clearScreen();
            System.out.println("Yarn Name: " + yarn.getName());
            System.out.println("Desctiption: " + yarn.getDescription());
            System.out.println();
            System.out.println("Press 'enter' to return to yarns menu.");
            input.nextLine();
            input.nextLine();
            yarnology();
        }
        else {
            System.out.println("Please enter a valid choice from the list.");
        }
    }

    public void stitchLibrary() {
        userManager.clearScreen();
        System.out.println("===========================================================================================");
        System.out.println("                                  Welcome to Stitch Library");
        System.out.println("===========================================================================================");
        System.out.println("                                       BASIC STITCHES:");
        System.out.println("1. Chain Stitch                2. Slip Stitch                   3. Single Crochet");
        System.out.println("4. Half Double Crochet         5. Double Crochet                6. Treble Crochet");
        System.out.println();
        System.out.println("                                   INTERMEDIATE STITCHES:");
        System.out.println("7. Double Treble Crochet       8. Front Post Double Crochet     9. Back Post Double Crochet");
        System.out.println("10. Cluster Stitch             11. Shell Stitch                 12. V-Stitch");
        System.out.println("13. Puff Stitch");
        System.out.println();
        System.out.println("                                     ADVANCED STTICHES:");
        System.out.println("14. Popcorn Stitch             15. Bobble Stitch                16. Spike Stitch");
        System.out.println("17. Catherine's Wheel          18. Star Stitch                  19. Crochet Cable");
        System.out.println("20. Basket Weave Stitch");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("  > Enter the number of the stitch you want to learn ('0' to exit): ");

        int stichNumber = -1;

        try {
            stichNumber = input.nextInt();
            input.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice from the list.");
            input.next();
            return;
        }

        if (stichNumber == 0) {
            return;
        }
        else if (stichNumber >= 1 && stichNumber <= 20) {
            Stitch stitch = stitches.get(stichNumber - 1);
            userManager.clearScreen();
            System.out.println("Stitch Name: " + stitch.getName());
            System.out.println("Description: " + stitch.getDescription());
            System.out.println("Tutorial:\n");
            System.out.println("\t\t" + stitch.getTutorial());
            System.out.println();
            System.out.println("Press 'enter' to return to stitch menu.");
            input.nextLine();
            input.nextLine();
            stitchLibrary();
        }
        else {
            System.out.println("Please enter a valid choice from the list.");
        }
    }

    public void tipsAndTricks() {
        userManager.clearScreen();
        System.out.println("=================================================================================");
        System.out.println("                            Welcome to Tips and Tricks");
        System.out.println("=================================================================================");
        System.out.println("  1. Keep a Crochet Journal                 2. Practice Yarn Tension");
        System.out.println("  3. Blocking Your Work                     4. Learn Foundation Stitches");
        System.out.println("  5. Chain Loosely for Foundation Rows      6. Mind Your Edges");
        System.out.println("  7. Use a Yarn Bowl                        8. Practice Frogging");
        System.out.println("  9. Magic Circle                           10. Use Scraps for Smaller Projects");
        System.out.println("  11. Master the Invisible Decrease         12. Changing of Colors");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("  > Enter the number of the tip you want to learn ('0' to exit): ");

        int tipNumber = -1;

        try {
            tipNumber = input.nextInt();
            input.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice from the list.");
            input.next();
            return;
        }

        if (tipNumber == 0) {
            return;
        }
        else if (tipNumber >= 1 && tipNumber <= 12) {
            Tips tips = tip.get(tipNumber - 1);
            userManager.clearScreen();
            System.out.println("Tip: " + tips.getName());
            System.out.println("Tip/Trick: " + tips.getTips());
            System.out.println();
            System.out.println("Press 'enter' to return to tips menu.");
            input.nextLine();
            input.nextLine();
            tipsAndTricks();
        }
        else {
            System.out.println("Please enter a valid choice from the list.");
        }
    }
}