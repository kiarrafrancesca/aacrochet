package crochet;

import java.util.ArrayList;
import java.util.List;

public class Stitch {
    private String name;
    private String description;
    private String tutorial;

    public Stitch(String name, String description, String tutorial) {
        this.name = name;
        this.description = description;
        this.tutorial = tutorial;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTutorial() {
        return tutorial;
    }
}

class StitchInitializer {
    public static List<Stitch> initializeStitches() {
        List<Stitch> stitches = new ArrayList<>();
        stitches.add (new Stitch(
            "Chain Stitch (ch)",
            "The foundation stitch used to begin most crochet projects.",
            "Tutorial:\n" +
            "\t\t1. Start with a slip knot on your hook.\n" +
            "\t\t2. Yarn over by wrapping the yarn around the hook from the back to front.\n" +
            "\t\t3. Pull the yarn through the loop on the hook.\n" +
            "\t\t4. Repeat until you have your desired number of chains."
        ));
        stitches.add (new Stitch(
            "Slip Stitch (sl st)",
            "A short, tight stitch often used for joining or finishing.",
            "Tutorial:\n" +
            "\t\t1. Insert the hook into the stitch you want to slip stitch into.\n" +
            "\t\t2. Yarn over and pull through both the stitch and the loop on your hook in one motion."
        ));
        stitches.add (new Stitch(
            "Single Crochet (sc)",
            "A simple creating a dense, firm fabric.",
            "Tutorial:\n" +
            "\t\t1. Insert the hook into the next stitch.\n" +
            "\t\t2. Yarn over and pull up a loop (you should have two loops on your hook).\n" +
            "\t\t3. Yarn over again and pull through both loops on the hook."
        ));
        stitches.add (new Stitch(
            "Half Double Crochet (hdc)",
            "Taller than a single crochet, with a softer texture.",
            "Tutorial:\n" +
            "\t\t1. Yarn over, then insert the hook into the next stitch.\n" +
            "\t\t2. Yarn over and pull up a loop (you should have three loops on your hook)\n" +
            "\t\t3. Yarn over again and pull through all three loops on the hook in one go."
        ));
        stitches.add (new Stitch(
            "Double Crochet (dc)",
            "Taller than a half double crochet, creating an open, flexibile fabric.",
            "Tutorial:\n" +
            "\t\t1. Yarn over, then insert the hook into the next stitch.\n" +
            "\t\t2. Yarn over again and pull up a loop (you should have three loops on your hook).\n" +
            "\t\t3. Yarn over and pull through the first two loops on the hook (you'll now have two loops left on the hook).\n" +
            "\t\t4. Yarn over again and pull through the remaining two loops."
        ));
        stitches.add (new Stitch(
            "Treble Crochet (tr)",
            "Or Triple Crochet, is a tall stitch providing an airy, open look.",
            "Tutorial:\n" +
            "\t\t1. Yarn over twice, then insert the hook into the next stitch.\n" +
            "\t\t2. Yarn over and pull up a loop (you should have four loops on your hook).\n" +
            "\t\t3. Yarn over and pull through the first two loops (you'll now have three loops left on the hook).\n" +
            "\t\t4. Yarn over again and pull through the next two loops (you'll now have two loops left on the hook).\n" +
            "\t\t5. Yarn over one last time and pull through the final two loops."
        ));
        stitches.add (new Stitch(
            "Double Treble Crochet (dtr)",
            "An even taller stitch with an open, lace-like effect.",
            "Tutorial:\n" +
            "\t\t1. Yarn over three times.\n" +
            "\t\t2. Insert the hook into the next stitch.\n" +
            "\t\t3. Yarn over and pull up a loop (you should have five loops on the hook).\n" +
            "\t\t4. Yarn over and pull through the first two loops (you'll have four loops left).\n" +
            "\t\t5. Yarn over and pull through the next two loops (you'll now have three loops left).\n" +
            "\t\t6. Yarn over and pull throug the next two loops (you'll now have two loops left).\n" +
            "\t\t7. Yarn over and pull through the last two loops to complete the stitch."
        ));
        stitches.add (new Stitch(
            "Front Post Double Crochet (fpdc)",
            "A textured stitch worked around the post of a stitch.",
            "Tutorial:\n" +
            "\t\t1. Yarn over, then insert the hook around the post of the next stitch (go in from the front,\n" +
            "\t\taround the back of the post, and back to the front).\n" +
            "\t\t2. Yarn over and pull up a loop (three loops on the hook).\n" +
            "\t\t3. Yarn over and pull through the first two loops (two loops remain)\n" +
            "\t\t4. Yarn over again and pull through the remaining two loops."
        ));
        stitches.add (new Stitch(
            "Back Post Double Crochet (bpdc)",
            "Similar to FPdc but worked from the back for raised texture.",
            "Tutorial:\n" +
            "\t\t1. Yarn over, then insert the hook around the post of the next stitch from the back (go in from\n" +
            "\t\tthe back, around the front of the post, and back out to the back).\n" +
            "\t\t2. Yarn over and pull up a loop (three loops on the hook).\n" +
            "\t\t3. Yarn over and pull through the first two loops (two loops remain).\n" +
            "\t\t4. Yarn over and pull through the remaining two loops."
        ));
        stitches.add (new Stitch(
            "Cluster Stitch",
            "A group of stitches worked together at the top, creating a thick texture.",
            "Tutorial:\n" +
            "\t\t1. Yarn over, insert the hook into the next stitch, yarn over, and pull up a loop.\n" +
            "\t\tYarn over and pull through two loops (you'll have two loops left).\n" +
            "\t\t2. Repeat step 1, two or three more times, each time inserting the hook into the same stitch,\n" +
            "\t\tuntil you have the desired number of loops (usually 4-5).\n" +
            "\t\t3. Yarn over and pull through all loops on the hook at once."
        ));
        stitches.add (new Stitch(
            "Shell Stitch",
            "A fan-like stitch formed by working multiple stitches into a single stitch.",
            "Tutorial:\n" +
            "\t\t1. Work five double crochets (or another specified number) into the same stitch or space."
        ));
        stitches.add (new Stitch(
            "V-Stitch",
            "A V-shaped stitch created by working two double crochets in the same space.",
            "Tutorial:\n" +
            "\t\t1. Work one double crochet, one chain, and another double crochet into the same stitch or space."
        ));
        stitches.add (new Stitch(
            "Puff Stitch",
            "A raised, rounded stitch made by drawing up loops multiple times.",
            "Tutorial:\n" +
            "\t\t1. Yarn over, insert the hook into the stitch, yarn over, and pull up a loop (three loops on the hook).\n" +
            "\t\t2. Repeat step 1, three to five times (or as specified), pulling up a loop each time\n" +
            "\t\t(you'll have multiple loops on the hook).\n" +
            "\t\t3. Yarn over and pull through all loops on the hook, then chain one to secure the puff."
        ));
        stitches.add (new Stitch(
            "Popcorn Stitch",
            "A 3D, textured stitch formed by grouping several stitches in one place.",
            "Tutorial:\n" +
            "\t\t1. Work five double crochets in the same stitch.\n" +
            "\t\t2. Remove your hook from the loop, insert it into the first dc of the five-dc group.\n" +
            "\t\t3. Reinsert the hook into the dropped look and pull it through the first dc, closing the popcorn."
        ));
        stitches.add (new Stitch(
            "Bobble Stitch",
            "Similar to the puff stitch but denser, adding significant texture.",
            "Tutorial:\n" +
            "\t\t1. Yarn over, insert the hook into the next stitch, yarn over, and pull up a loop.\n" +
            "\t\tYarn over and pull through two loops (two loops left).\n" +
            "\t\t2. Repeat step 1, three to four times (you should have 5-6 loops on the hook).\n" +
            "\t\t3. Yarn over and pull through all loops on the hook at once."
        ));
        stitches.add (new Stitch(
            "Spike Stitch",
            "Worked into stitches in rows below, creating an elongated effect.",
            "Tutorial:\n" +
            "\t\t1. Insert the hook into a stitch one or more rows below the current row.\n" +
            "\t\t2. Yarn over and pull up a loop to the height of the current row.\n" +
            "\t\t3. Yarn over and pull through the both loops on the hook (if working a single crochet spike stitch)."
        ));
        stitches.add (new Stitch(
            "Catherine's Wheel",
            "A decorative stitch pattern that resembles wheels or circles.",
            "Tutorial:\n" +
            "\t\t1. To start the wheel, work 5 double crochets in one stitch (this forms a shell).\n" +
            "\t\t2. Skip several stitches (usually 3-5 depending on pattern), single crochet to anchor.\n" +
            "\t\t3. In the next stitch, skip the single crochet and work another shell stitch.\n" +
            "\t\t4. Offset the shells in the next row to create the circular 'wheel' effect."
        ));
        stitches.add (new Stitch(
            "Star Stitch",
            "A decorative, intricate stitch that resembled stars or flowers.",
            "Tutorial:\n" +
            "\t\t1. Insert the hook into the 2nd chain from the hook, yarn over, and pull up a loop.\n" +
            "\t\tRepeat into the next four chains (you should have six loops on the hook).\n" +
            "\t\t2. Yarn over a pull through all six loops. Chain one to complete the first star.\n" +
            "\t\t3. For subsequent stars, insert the hook into the eye of the last star and pull up a loop,\n" +
            "\t\trepeating around the previous star."
        ));
        stitches.add (new Stitch(
            "Crochet Cables",
            "Raised stitches that create a cable effect, similar to knitted cables.",
            "Tutorial:\n" +
            "\t\t1. Work FPDC stitches across selected stitches to create the look of cables.\n" +
            "\t\t2. For crossing cables, skip stitches in front and then work FPDC behind, or work them in a twisted order."  
        ));
        stitches.add (new Stitch(
            "Basket Weave Stitch",
            "Alternating front and back post stitches for a woven look.",
            "Tutorial:\n" +
            "\t\t1. Work rows of alternating FPDC and BPDC stitches.\n" +
            "\t\t2. After a few rows, switch the FPDC and BPDC positions to create the woven look."
        ));
        return stitches;
    }
}