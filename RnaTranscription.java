class RnaTranscription {
    Character getChar(Character a) {
        switch(a) {
            case 'G':
                return 'C';
            case 'C':
                return 'G';
            case 'T':
                return 'A';
            case 'A' :
                return 'U';
        }
        return ' ';
    }
    String transcribe(String d) {
        String a = "";
        for(int i = 0;i<d.length();i++) {
            a += getChar(d.charAt(i));
        }
        return a;
    }

}

