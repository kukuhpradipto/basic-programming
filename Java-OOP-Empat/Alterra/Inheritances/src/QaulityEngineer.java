public class QaulityEngineer extends Karyawan {
    int bonus;
    int skillAutomation;

    public QaulityEngineer(int bonus, int skillAutomation) {
        this.bonus = bonus;
        this.skillAutomation = skillAutomation;
    }

    public void spillSkillAutomation(){
        System.out.println("Aku Seorang QA Manager dengan ahli sebanyak" + this.skillAutomation);
    }

    public int hitungGajiTambahBonus(){
    int hasil = this.gaji + this.bonus;
    return  hasil;
    }

}
