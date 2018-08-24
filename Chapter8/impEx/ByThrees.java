package impEx;

class ByThrees implements Series {
    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }

    public int getNext() {
        return val += 3;
    }

    public void reset(){
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}


