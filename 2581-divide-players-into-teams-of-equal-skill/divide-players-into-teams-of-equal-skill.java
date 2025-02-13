class Solution {
    public long dividePlayers(int[] skill) {
        int totalSkill = 0;
        int teamSize = (skill.length)/2;
        long result=0;
        for(int n : skill)  totalSkill+=n;
        int teamSkill = 0;
        if(totalSkill%teamSize==0) {
            teamSkill = totalSkill/teamSize;
        }else return -1;
        Arrays.sort(skill);
        int i=0,j=skill.length-1;
        int skills=0;
        while(i<j){
            skills=skill[i]+skill[j];
            if(skills!=teamSkill) return -1;
            result+=skill[i]*skill[j];
            i++;
            j--;
        }
        return result;

    }
}