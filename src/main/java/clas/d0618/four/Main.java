package clas.d0618.four;
// 문제 : `무기 a무기 = new 칼();` 가 실행되는 세부과정을 자세히 쓰세요.
// 문제 : 매개변수를 사용해서 전사가 매번 다르게 공격하도록 해주세요.

class Main {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격(/* 수정가능지역 시작 */"브라이언", "칼"/* 수정가능지역 끝 */);
        // 브라이언이(가) 칼(으)로 공격합니다.

        a전사.공격(/* 수정가능지역 시작 */"필립", "창" /* 수정가능지역 끝 */);
        // 필립이(가) 창(으)로 공격합니다.

        a전사.공격(/* 수정가능지역 시작 */"마크", "지팡이"/* 수정가능지역 끝 */);
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(가) 지팡이(으)로 공격합니다.
    }
}
class 전사 {
    String 공격자;
    String 무기;
    void 공격문구출력(String 공격자, String 무기){
        System.out.println(공격자 + "이(가) " + 무기 + "(으)로 공격합니다.");
    }
    public void 공격(String 공격자, String 무기){
        this.공격자 = 공격자;
        this.무기 = 무기;
        공격문구출력(공격자,무기);
    }
    public void 재공격() {
        공격문구출력(this.공격자,this.무기);
    }
}