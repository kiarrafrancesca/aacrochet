package crochet;

import java.util.ArrayList;
import java.util.List;

public class Tool {
    private String name;
    private String description;
    
    public Tool(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

class ToolInitializer {
    public static List<Tool> initializeTools() {
        List<Tool> tools = new ArrayList<>();
        tools.add (new Tool(
            "Crochet Hook",
            "Used to create stitches by pulling yarn through loops.\n" +
            "\t\tSizes: 2.00 mm, 2.25mm, 2.5mm, 2.75mm, 3.00mm, so on...\n" +
            "\t\tMaterials: Metal, Plastic, or Bamboo"
        ));
        tools.add (new Tool(
            "Scissor",
            "A small, sharp scissor designed for precision cutting of yarn."
        ));
        tools.add (new Tool(
            "Stitch Marker",
            "A small clip or ring used to mark crochet project, such as the beginning or end of a round,\n" +
            "helping you keep track of your progress."
        ));
        tools.add (new Tool(
            "Tapestry Needle",
            "A large, blunt needle with a wide eye, specifically designed for weaving in yarn\n" +
            "ends and stitching pieces of your crochet projects together, ensuring a neat finish."
        ));
        tools.add (new Tool(
            "Measuring Tape",
            "A flexible tape measure, used to check the dimensions of your crochet\n" +
            "items to ensure accuracy and fit."
        ));
        tools.add (new Tool(
            "Yarn Winder",
            "A handy tool that transform skeins or hanks of yarn into tidy, \n" +
            "compact cakes, preventing tangling and allowing for easy access during your crochet work."
        ));
        tools.add (new Tool(
            "Safety Eyes and Nose",
            "Plastic eyes and noses designed for use in amigurumi, providing a secure\n" +
            "and safe option for adding facial features without the risk of detachment."
        ));
        tools.add (new Tool(
            "Stuffing (polyfill)",
            "Soft, fluffly filler material used to give shape and dimensions to\n" +
            "stuffed crochet items like toys and pillows, ensuring a plush and cuddly finish."
        ));
        tools.add (new Tool(
            "Buttons",
            "Decorative or functional fasteners available in various sizes, colors, and materials,\n" +
            "used to secure opening on garents or add a personalied touch to crochet accessories."
        ));
        tools.add (new Tool(
            "Lobster Claw or Hook",
            "A type of clasp that allows for easy attachment and detachment of crochet\n" +
            "items to keychains, bags, or other accessories, providing functionality and style."
        ));
        tools.add (new Tool(
            "D-Ring or Buckle",
            "Sturdy metal hardware used for attaching strap on bags, belts, or other\n" +
            "crochet projects, adding durability and a professional finish."
        ));
        tools.add (new Tool(
            "Keychain Ring (Metal Chain Links & Jump Rings)",
            "A metal ring for holding keys or charms, complemented by metal chain links for added length\n" +
            "and jump rings for connecting components, ideal for creating personalized crochet keychains."
        ));
        return tools;
    }
}