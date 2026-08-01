class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> score = new ArrayList<>();
        int si = 1;
        int e = Integer.parseInt(operations[0]);
        score.add(e);
        for(int i=1; i<operations.length; i++){
            char[] s = operations[i].toCharArray();
            if(s[0] == 'D'){
                score.add(2*score.get(si-1));
                si++;
            } else if (s[0] == 'C'){
                score.remove(si-1);
                si--;
            } else if(s[0] == '+'){
                score.add(score.get(si-1)+score.get(si-2));
                si++;
            } else{
                int elt = Integer.parseInt(operations[i]);
                score.add(elt);
                si++;
            }
        }
        int ans = 0;
        for(int i = 0; i < score.size(); i++){
            ans += score.get(i);
        }
        return ans;
    }
}