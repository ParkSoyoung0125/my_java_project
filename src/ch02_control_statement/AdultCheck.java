package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동" ; // 이름
        int age = 22 ; // 나이
        String adult ; // 성인 체크
        int _gender = 1 ; // 주민번호 뒷자리 성별(숫자)
        String gender ; // 성별(한글)

        System.out.println("이름 : " + name);
        if (age >= 19) {
            adult = "성인";
        } else {
            adult = "미성년자";
        }

        if(_gender == 1 || _gender == 3) {
             gender = "남자";
         } else {
             gender = "여자";
         }

        String message ;
        message = "이름 : " + name + "\n"
                + "나이 : " + age + "\n"
                + "성인유무 : " + adult + "\n"
                + "성별 : " + gender ;
        System.out.println(message);
    }
}
