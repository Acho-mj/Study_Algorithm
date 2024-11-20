package 프로그래머스.Lv0;

public class PRO_코드처리하기 {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder("");
        String[] strCode = code.split("");
        int mode = 0;

        // 문자열 code 순회
        for(int idx=0; idx<strCode.length; idx++){
            // 문자가 1이면 mode를 바꾼다.
            if(strCode[idx].equals("1")){
                mode = (mode == 0) ? 1 : 0;
            }else{
                // mode에 따른 처리
                switch (mode){
                    case 0:
                        if(idx % 2 == 0){
                            ret.append(strCode[idx]);
                        }
                        break;

                    case 1:
                        if(idx % 2 != 0){
                            ret.append(strCode[idx]);
                        }
                        break;
                }
            }
        }
        // 빈 문자열일 경우
        if(ret.length() == 0)
            return "EMPTY";

        return ret.toString();
    }
}
