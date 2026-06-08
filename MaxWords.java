public class MaxWords {
  public int mostWordsFound(String[] sentences){
   

    int spaceCount = 0;
    int maxWords = 0;
    for(int i =0; i<sentences.length; i++){
      String s = sentences[i];
        for(int j = 0; j<s.length(); j++){
          if(s.charAt(j) ==' '){
            spaceCount++;
          }
        }
        int words = spaceCount+1;
        maxWords = Math.max(maxWords, words);
    }
    return maxWords;

  }

  public static void main(String args[]){
    MaxWords w = new MaxWords();
    String[]  sentences = {
      "alice and bob love leetcode", "i think so too", "this is great thanks very much"
    };
    System.out.println(w.mostWordsFound(sentences));

  }
  
}
