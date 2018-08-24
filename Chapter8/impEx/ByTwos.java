package impEx;

class ByTwos implements Series {
    int start;
    int val;

    ByTwos(){
        start = 0;
        val = 0;
    }

    public int getNext() {
        return val += 2;
    }

    public void reset(){
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}


