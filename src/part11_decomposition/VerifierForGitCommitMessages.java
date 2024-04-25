package part11_decomposition;

import java.util.Arrays;

public class VerifierForGitCommitMessages {
    public static void main(String[] args) {
        String commitMessage =
                "Summarize changes in around 50 characters or less \n" +
                        "\n" +
                        "More detailed explanatory text, if necessary. Wrap it to about 72 \n" +
                        "characters or so. In some contexts, the first line is treated as the\n" +
                        "subject of the commit and the rest of the text as the body. The\n" +
                        "blank line separating the summary from the body is critical (unless\n" +
                        "you omit the body entirely); various tools like `log`, `shortlog`000000000000000000000000000000000000000000000000000000\n" +
                        "and `rebase` can get confused if you run the two together.\n" +
                        "\n" +
                        "Explain the problem that this commit is solving. Focus on why you\n" +
                        "are making this change as opposed to how (the code explains that).\n" +
                        "Are there side effects or other unintuitive consequences of this\n" +
                        "change? Here's the place to explain them.";
        validateGitCommitMessage(commitMessage);
    }

    private static void validateGitCommitMessage(final String commitMessage) {
        getSubject(commitMessage);


    }

    private static boolean getSubject(String commitMessage) {
        StringBuilder subject = new StringBuilder();
        int bodyIndex = 0;
        char [] ArrChar = commitMessage.toCharArray();

        for (int i = 0; i < ArrChar.length; i++){
            if(Character.isLetter(ArrChar[i]) || Character.isDigit(ArrChar[i]) || ArrChar[i] == ' '){
                subject.append(ArrChar[i]);
            } else if (ArrChar[i] == '\n' ) {
                bodyIndex = i ;
                break;
            }
        }

        if (subject.length() <= 50 && isUpper(subject.charAt(0)) && subject.charAt(subject.length()-1) != '.'){
            System.out.println("Subject is valid!");
        } else if (subject.length() > 50){
            System.out.println("Subject is long then 50 characters. Message is invalid");
            return false;
        } else if (!isUpper(subject.charAt(0))) {
            System.out.println("Subject is starts from low letter. Message is invalid");
            return false;
        } else if (subject.charAt(subject.length()-1) == '.') {
            System.out.println("Subject is end '.' . Message is invalid");
            return false;
        }

        return getBody(bodyIndex, ArrChar);

    }

    private static boolean getBody(int bodyIndex, char[] ArrChar) {
        int indexStart = bodyIndex ;
        int bodyStringIndexStart = indexStart ; // start string
        int bodyStringIndexEnd = 0;
        //StringBuilder body = new StringBuilder();
        for (int i = indexStart; i < ArrChar.length; i++ ){
            if(Character.isLetter(ArrChar[i]) || Character.isDigit(ArrChar[i]) || ArrChar[i] == ' '){
                //body.append(ArrChar[i]);
                continue;
            }else if (ArrChar[i] == '\n'){
                 bodyStringIndexEnd = i; // end of string
                if (bodyStringIndexEnd - bodyStringIndexStart > 72){
                    System.out.println("Body invalid , one of strings is more then 72 characters in string" );
                    return false;
                }else {
                    bodyStringIndexStart = bodyStringIndexEnd;
                }
            }
        }
        return true;

    }

    private static boolean isUpper(char firstChar){
        char [] UpperChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0 ;  i < UpperChars.length;i++ ){
            if (firstChar == UpperChars[i]){
                return true;
            }
        }
        return false;
    }
}
