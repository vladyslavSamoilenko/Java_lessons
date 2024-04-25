package part11_decomposition;

import java.util.Arrays;

public class VerifierForGitCommitMessages {
    public static void main(String[] args) {
        String commitMessage = "Together If applied, this commit will refactor." +
                       "\n" +
                       "More detailed explanatory text, if necessary. Wrap it to about 72 \n" +
                        "characters or so. In some contexts, the first line is treated as the\n" +
                        "subject of the commit and the rest of the text as the body. The\n" +
                        "blank line separating the summary from the body is critical (unless\n" +
                        "you omit the body entirely); various tools like `log`, `shortlog`\n" +
                        "and `rebase` can get confused if you run the two together.\n" +
                       "\n" +
                        "Explain the problem that this commit is solving. Focus on why you\n" +
                        "are making this change as opposed to how (the code explains that).\n" +
                       "Are there side effects or other unintuitive consequences of this\n" ;

        validateGitCommitMessage(commitMessage);
    }

    private static void validateGitCommitMessage(final String commitMessage) {
        getSubject(commitMessage);
    }

    private static boolean getSubject(String commitMessage) {
        int bodyIndex = 0;
        char [] ArrChar = commitMessage.toCharArray();
        int SubjectStringIndexStart = 0; // start string
        int SubjectStringIndexEnd = 0; // end

        if (commitMessage.length() == 0){
            System.exit(41); // no text
        }
        for (int i = 0; i < ArrChar.length; i++){
            if(Character.isLetter(ArrChar[i]) || Character.isDigit(ArrChar[i]) || ArrChar[i] == ' '){
                if (i == ArrChar.length-1){
                    SubjectStringIndexEnd = i;
                    if (SubjectStringIndexEnd - SubjectStringIndexStart > 50) {
                        System.exit(11); // subject length great then 50 characters
                    } else if (!isUpper(ArrChar[0])) {
                        System.exit(12); // subjects first letter isn`t great
                    } else if (ArrChar[SubjectStringIndexEnd - 1] == '.') {
                        System.exit(13); // subject last character is '.'
                    } else {
                        bodyIndex = i;
                        break;
                    }
                }
                continue;
            } else if (ArrChar[i] == '\n' ) {
                SubjectStringIndexEnd = i;
                if (SubjectStringIndexEnd - SubjectStringIndexStart > 50) {;
                    System.exit(21);// subject length great then 50 characters
                } else if (!isUpper(ArrChar[0])) {
                    System.exit(22);// subjects first letter isn`t great
                } else if (ArrChar[SubjectStringIndexEnd - 1] == '.') {
                    System.exit(23);//subject last character is '.'
                } else {
                    bodyIndex = i;
                    break;
                }
            }
        }
        return getBody(bodyIndex, ArrChar);

    }

    private static boolean getBody(int bodyIndex, char[] ArrChar) {
        int indexStart = bodyIndex ;
        int bodyStringIndexStart = indexStart ; // start string
        int bodyStringIndexEnd = 0;

        for (int i = indexStart; i < ArrChar.length; i++ ){
            if(Character.isLetter(ArrChar[i]) || Character.isDigit(ArrChar[i]) || ArrChar[i] == ' '){
                continue;
            }else if (ArrChar[i] == '\n'){
                 bodyStringIndexEnd = i; // end of string
                if (bodyStringIndexEnd - bodyStringIndexStart > 72){
                    System.exit(31);//Body invalid , one of strings is great then 72 characters in string
                }else {
                    bodyStringIndexStart = bodyStringIndexEnd;
                }
            }
        }
        System.out.println("Commit valid");
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
