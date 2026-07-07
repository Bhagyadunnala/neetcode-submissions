class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            list.add(new String(c));
        }

        List<List<String>> output=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<list.size();i++){
            
            if(!set.contains(list.get(i))){
                List<String> help=new ArrayList<>();
                set.add(list.get(i));
                help.add(strs[i]);
                for(int j=i+1;j<list.size();j++){
                    if(list.get(i).equals(list.get(j))){
                        help.add(strs[j]);
                    }
                }
                output.add(help);
            }
        }

        return output;
    }
}
