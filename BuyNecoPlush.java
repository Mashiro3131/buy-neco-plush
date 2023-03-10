import java.util.*;

public class BuyNecoPlush {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    // List of sentences if the user replies no to the second question
    String[] sentences = {
      "Oops, I think you made the wrong choice...",
      "I think you should reconsider your answer... ?",
      "I think you really want to play !",
      "psssssssssssssst! type 'yes' !!",
      "Burenyuuuu~, I'll give you a hint: you should type 'yes' ",
      "lmao you're so funny, you should try again",
    };

    // Welcome message
    System.out.println("Welcome to 'Do you need a neco plush ?' Answer each question with either 'yes' or 'no' to see if you need it...");

    // Starts Game
    String answer = "no";
    while (answer.equals("no")) {
      System.out.println("Are you ready to play ? (yes/no)");
      answer = scanner.nextLine();
      if (answer.equals("no")) {
      
      // Generates a random int between 0 and the length of the list to choose a random sentence
      Random rand = new Random();
      int index = rand.nextInt(sentences.length);

      // Chooses a random sentence from the 'sentence' list
      String randomSentence = sentences[index];

        // Prints a random sentence when the user replies no
        System.out.println(randomSentence);
      }
    }


    // Begin the game
    System.out.println("Great! Let's start...");



          // Question 1
          System.out.println("Do you have money ? (yes / not for neco plush / no)");
          answer = scanner.nextLine();
    
          // Yes
          if (answer.equals("yes"))
          {
            System.out.println("Shaaaaaaaaaa!");
            displayNecoArt();
            System.exit(0);
          }

          // No money for neco plush
          else if (answer.equals("not for neco plush"))
          {
            System.out.println("Blashphemy! Buy one now.");
            displayNecoArt();
            System.exit(0);
          }

          // No
          else if (answer.equals("no"))
          {
            System.out.println("Ok, next question.");
          }
        


          // Question 2
          System.out.println("Do you have a job ? (yes / no)");
          answer = scanner.nextLine();

          // Yes
          if (answer.equals("yes"))
          {
            System.out.println("They pay you ?");
            answer = scanner.nextLine();

            // Yes
            if (answer.equals("yes"))
            {
              System.out.println("Then you must buy the Neco Arc Plush!");
              displayNecoArt();
              System.exit(0);
            }
            
            // No
            else if (answer.equals("no"))
            {
              System.out.println("Hmmm... Next question.");
            }
            
          // No
          else if (answer.equals("no"))
          {
            System.out.println("Ok, next question.");
          }



        // Question 3
        System.out.println("Do you have possessions ? (yes / no)");
        answer = scanner.nextLine();

        // Yes
        if (answer.equals("yes"))
        {
          System.out.println("Sell them.");
          displayNecoArt();
          System.exit(0);
        }

        // No
        else if (answer.equals("no"))
        {
          System.out.println("Oh wow, when will you answer yes? Next question...");
        }



        // Question 4
        while (true) {
          System.out.println("Do you even have a soul ? (yes / no)");
          answer = scanner.nextLine();
    
          // Yes
          if (answer.equals("yes")) {
            System.out.println("Good, now sell it.");
            displayNecoArt();
            System.exit(0);
          }
    
          // No
          else if (answer.equals("no")) {
            System.out.println("Liar... you won't fool me with this.");
          }
        }
      }
      scanner.close();
    }
      
    
    
        // Neco Arc ASCII Art
  public static void displayNecoArt()
              {
              System.out.println("""
              ....................................................................................................
              ....................................................................................................
              ....................................................................................................
              .....;@@@@@@@@@@@@@@@@@@@++;:,.....,@@@@@@;.............:@@@@@@,.,@@@@@@+...............:@@@@@@;....
              .....?@@@@@@@@@@@@@@@@@@@@#%+,.....,@@@@@@?.............+@@@@@@:..;@@@@@@%,............;@@@@@@%,....
              .....?@@@@@@@@@@@@@@@@@@@@@@@S:....,#@@@@@?.............+@@@@@@:...:S@@@@@S:..........+@@@@@@*......
              .....?@@@@@#;;;;;;;;;;*S@@@@@@#,...,#@@@@@?.............+@@@@@@:....,%@@@@@#:........?@@@@@@+.......
              .....?@@@@@#............*@@@@@@;...,#@@@@@?.............+@@@@@@:.....,?@@@@@@;.....,%@@@@@#;........
              .....?@@@@@#............;@@@@@@:...,#@@@@@?.............+@@@@@@:.......*@@@@@@*...,S@@@@@S:.........
              .....?@@@@@#,.......,,:+#@@@@@?....,#@@@@@?.............+@@@@@@:........+@@@@@@?.:#@@@@@%,..........
              .....?@@@@@@##########@@@@@@%;.....,#@@@@@?.............+@@@@@@:.........;#@@@@@%#@@@@@?,...........
              .....?@@@@@@@@@@@@@@@@@@@@@@%+,....,#@@@@@?.............+@@@@@@:..........:S@@@@@@@@@@*.............
              .....?@@@@@@??????????%S@@@@@@#;...,#@@@@@?.............+@@@@@@:...........,%@@@@@@@@+..............
              .....?@@@@@#............:%@@@@@@:..,#@@@@@*.............;@@@@@@:.............%@@@@@@;...............
              .....?@@@@@#.............,#@@@@@*..,#@@@@@?.............+@@@@@@:.............*@@@@@#,...............
              .....?@@@@@#.............,@@@@@@?...S@@@@@#,............%@@@@@#,.............*@@@@@@,...............
              .....?@@@@@#..........,,+#@@@@@@;...+@@@@@@S;,........:%@@@@@@*..............*@@@@@@,...............
              .....?@@@@@@SSSSSSSSSS#@@@@@@@@*.....*@@@@@@@#%?***?%#@@@@@@@%,..............*@@@@@@,...............
              .....?@@@@@@@@@@@@@@@@@@@@@@@%;.......;S@@@@@@@@@@@@@@@@@@@S+................*@@@@@@,...............
              .....?##################S%?+,...........:*%#@@@@@@@@@@@#%*;,.................+######,...............
              .....,,,,,,,,,,,,,,,,,,.....................,::;;;;;::,,......................,,,,,,................
              ....................................................................................................
              ....................................................................................................
              @@@@@@@@@@@@%???%%SS@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@@@#?;:;;;;++**??%SS@@@@@@@S%????%#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@@@?+++;+*+;:::::;++**?%S#?+:::::;+*%@@@@@@#%?++++*?%S#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@@?;+++*??****+;:::::::;;+::::::::::;+?SS%?+;:::::::;++?%SS@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@S+;+++++*?**+*??*;::::::::::::::::::::++::::::::::::::::;*?%S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@?:++++**+*???*++?%%?+::::::::::::::::::::::::::::::::::::::;*%S%@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@S*:+*%??**++++++;;*%?+:::::::::::::::::::::::::::::::::::::::::+%S#@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@#+:+++*????***+;;+*+::::::::::::::::::::::::::::::::::::::::::::;++++****???%%%S###@@@@@@@@@
              @@@@@@@@#+:+++++++?%?*++**::::::::::::::::::::::::::::::::::::::::::::::::::::::::::;;;;++++****?%@@
              @@@@@@@@#*,++++++??+;;+*;::::::::,,,,,,:::::::::::::::::::::::::::::::::::::::::::::::::::::::::+S@@
              @@@@@@@@%%,;+++**+++*?+:::::::::::::,,,,,,,,,,,,,:::::::::::::::::::::;********+++++***++;;;::::+S@@
              @@@@@@@@@S+,++***??%?;:::::::::::::::::::,,,,,,,,,,,,,,,,,:::::::::::::*S*;;;;;+++++++***++++++;+S@@
              @@@@@@@@@?%;,?******::::::::::::::::::::::::::::::::::::::::::::::::::::+%*;;;;+**????***?*++++;*S@@
              @@@@@@@@@@%%;,;++;;::::::::::::::::::::::::::::::::::::::::::::::::::::::+%*;+++;;+?%????*??+++;%S@@
              @@@@@@@@@@@%S+:;;:::::::::::::::;;:::;?+::::::::::::::::::::::::::::::::::;%*;*?*++;*?*+++**++;*%@@@
              @@@@@@@@@@@@*S?:::::::::::;;;;+*?::;*???::+::::::::::::::::::::::::::::::::;%*;*???*++?*++++++*%?@@@
              @@@@@@@@@@@@%*;::::;;+++++++++*??**?*:,*+:?*;::?+:::::::::::::::::::::::::::;%++?????*+?*+++++%%@@@@
              @@@@@@@@@@S?+:::;*?*;:,.........;#@%?;,,?+???;:??*:+*::::::::::+;::::::::::::+%++?++*?**?++++%%@@@@@
              @@@@@@@@#%*::::;%+,............+#@#::**::?????+?++*+?*;:::;;:::;?;::::::::::::+%+?+++++**++*%S@@@@@@
              @@@@@@@%?;::::;%;.............;#@@%...;?::%???%?;,+%?%?+;;;?;:::*?+::::::::::::*??++++++++?%@@@@@@@@
              @@@@@S%*;;**;:+?.............:#@#@;....,?:;%??%?+;;;:::;;+*%?+::;??+::::::::::::??++++++*?S@@@@@@@@@
              @@@S%%**?%?;::+%,...........,S@#@%......:*,*%*;,...........,%#S*;*??+:::::::::::;+++++*?%@@@@@@@@@@@
              @@%%%?%%S?:::;*%+...........+@#@#:......,%?*:.............,%@@@*+?%??+:::::::::::::;;*%S@@@@@@@@@@@@
              +%%%%%@%?:::+???%*:.........?@@@+.......+S+..............,S@#@%..:*%??+::::::::+::::::?S@@@@@@@@@@@@
              *?@@@@%%;::*??????%*;,......?@#+......:*%?..............,%@###;....;%%?+:::::::*?+;::::%S@@@@@@@@@@@
              @@@@@+S+:;?????????:+**+:,..:+,..,,:+**+,?;.............*@##@?......:%??;::::::+???+;::;%?@@@@@@@@@@
              @@@@@%?:+?????????%:,,:;****+++****+;:,,,:?*,..........,S@#@S,.......*%??;:::::+?????*;:+%@@@@@@@@@@
              @@@@%%+*???????%??%*,,,,,,,::++::,,,,,,,,,:*?;,........;@#@S:.......,????*:::::;???%%%?*;*%@@@@@@@@@
              @@@@%???????%%%%???%;,,,,,,,,%+,,,,,,,,,,,,,:*?+:,.....;@@S:.......,*%????*:::::???%@%%%%*%?@@@@@@@@
              @@@%%????%%%%@%?????%;,,,,,,,%?,,,,:;?;,,,,,,,:;+*+;:,,;#*,.....,:+%%??????+::::*??%.@@@@@%*@@@@@@@@
              @@@%%?%%%S@@@*%??????%*,,,,,,;?*++*?*?%:,,,,,,,:+::;;++++;;;;+++*%%???%?????*+++???%@@@@@@@@@@@@@@@@
              @@@%%%@@@@@@@%%??????%S%+,,,,,,::::,,,+%+:,,:;*?+,,,,,,,,,,:+***%???*+;;:::::;;;++*?SS@@@@@@@@@@@@@@
              @@@@@@@@@@@@@%%????%%%%%%?+:,,,,,,,,,,,:++++++:,,,,,,,,,,:;***?%%?+:,,,,,,,,,,,,,,,,;*%S@@@@@@@@@@@@
              @@@@@@@@@@@@@S???%%S@@%%??%%*;,,,,,,,,,,,,,,,,,,,,,,,,,:;+*??%?%?:,,,..,,,,,,,,,,,,,,,:?S@@@@@@@@@@@
              @@@@@@@@@@@@@%%%%@@@@@%????%S%?*;:,,,,,,,,,,,,,,,,,,,:+*??%%???%:,,,,,,,,,,,,,,,,,,,,,,,*S@@@@@@@@@@
              @@@@@@@@@@@@@?@@@@@@@@%%%%@@@%%%%%?+;:::,,,,,,,:::;+??%%%?%???%*,,,,,,,,,,,,,,,,,,,,,,,,,?S@@@@@@@@@
              @@@@@@@@@@@@@@@@@@@@@@%S#?%%*++;;+%*:+%????????*?%%%?????%S???S+,,,,,,,,,,,,,,,,,,,,,,,,,;S@@@@@@@@@
              @@@@@@@@@@@@@@@@@@@#S%?+;**:....,?*+**?**+++****?%**%??%%#%???%*,,,,,,,,,,,,,,,,,,,,,,,,,:%@@@@@@@@@
              @@@@@@@@@@@@@@@@#S%*;,..;*,.....:?*;......,;???*;:**:,,;*?S%?*?%:,,,,,,,,,,,,,,,,,,,,,,,:+%@@@@@@@@@
              @@@@@@@@@@@@@%S%?;,.....+??,.....+?+:,,;+??*;:,.:?+...,+?*;::+**%:,,,,,,,,,,,,,,,,,,,,,;+?S@@@@@@@@@
              @@@@@@@@@@@#S%*:........;S;.......,:;;+*+:,....,%;...:?+:..,?%:,*%;,,,,,,,,,,,,,,,,,:;+*?%?@@@@@@@@@
              @@@@@@@@@?S%+,.....,,:;+*?....................,*?...,+:....+S+,::*%*:,,,,,,,,,,,,::;+**%%?@@@@@@@@@@
              @@@@@@@@@S*,....,;+***++?;....................,?*...,......;S*++++*%%*+;::::::;;++**?%%%@@@@@@@@@@@@
              @@@@@@@@@%*......,;*????%,....................,*?:.........,??****????%?**********?%%%.@@@@@@@@@@@@@
              @@@@@@@@@%%,.......,;++?*......................;*?*;,.......,??****++?%%%%?????%%%%%@@@@@@@@@@@@@@@@
              @@@@@@@@@*S+.....,,::+*?+.....................,+?????*+::,,,,:?*+++*%%@@@@@S##S?@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@@%%:.:+???**+;?;..................,;+*?*++++*%%?**++++??*?%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@@@%%??+;:,,,,,*;..................++::++++++*%S#%%%%%%%%%%*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@@@S?;,.,,,,,,,?;....................,++++++*%%@@@@@@@#S**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
              @@@@@@@@@@S?,,,..,,,,;+;,...................,+++++++%S@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                  """);
              };
}

// Author: Nico Mengisen aka Mashiro3131
// Date: Thursday, the 29th of December 2022