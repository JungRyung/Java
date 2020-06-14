package ahahah.control;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class PitcherVO{
    private double ERA;
    private int G;
    private int CG;
    private int SHO;
    private int W;
    private int L;
    private int SV;
    private int HLD;
    private double WPCT;
    private int TBF;
    private String IP;
    private int H;
    private int HR;
    private int BB;
    private int HBP;
    private int SO;
    private int R;
    private int ER;

    public void setBB(int bb){
        this.BB = bb;
    }
    public void setCG(int cg){
        this.CG = cg;
    }
    public void setERA(double era){
        this.ERA = era;
    }
    public void setG(int g){
        this.G = g;
    }
    public void setH(int h){
        this.H = h;
    }
    public void setHLD(int hld){
        this.HLD = hld;
    }
    public void setHBP(int hbp){
        this.HBP = hbp;
    }
    public void setHR(int hr){
        this.HR = hr;
    }
    public void setIP(String ip){
        this.IP = ip;
    }
    public void setL(int l){
        this.L = l;
    }
    public void setR(int r){
        this.R = r;
    }
    public void setSHO(int sho){
        this.SHO = sho;
    }
    public void setSO(int so){
        this.SO = so;
    }
    public void setSV(int sv){
        this.SV = sv;
    }
    public void setTBF(int tbf){
        this.TBF = tbf;
    }
    public void setW(int w){
        this.W = w;
    }
    public void setWPCT(double wpct){
        this.WPCT = wpct;
    }
    public void toString(){
        print('%d, ',this.ERA);
        print(this.G+', ');
        print(this.CG+', ');
        print(this.SHO+', ');
        print(this.W+', ');
        print(this.L+', ');
        print(this.SV+', ');
        print(this.HLD+', ');
        print(this.WPCT+', ');
        print(this.TBF+', ');
        print(this.IP+', ');
        print(this.H+', ');
        print(this.HR+', ');
        print(this.BB+', ');
        print(this.HBP+', ');
        print(this.SO+', ');
        print(this.R+', ');
        print(this.ER+', ');
    }
}
public class KBOplayer_record_crawling{
 
    public static void main(String[] args) throws Exception {
        
        int player [] = {72447, 70425, 77748, 60768};
        
        //크롤링할 주소
        for(int i=0 ; i<4 ; i++) {
                String URL = "https://www.koreabaseball.com/Record/Player/PitcherDetail/Total.aspx?playerId=" + player[i];
                Document doc = Jsoup.connect(URL).get();
                
                
                Elements elem = doc.select("tfoot.play_record");
                PitcherVO PV = new PitcherVO();
                for(int j=0 ; j<elem.size() ; j++) {
                    double ERA = Double.parseDouble(elem.get(j).child(1).child(1).text());
                    int G = Integer.parseInt(elem.get(j).child(1).child(2).text());
                    int CG = Integer.parseInt(elem.get(j).child(1).child(3).text());
                    int SHO = Integer.parseInt(elem.get(j).child(1).child(4).text());
                    int W = Integer.parseInt(elem.get(j).child(1).child(5).text());
                    int L = Integer.parseInt(elem.get(j).child(1).child(6).text());
                    int SV =Integer.parseInt(elem.get(j).child(1).child(7).text());
                    int HLD =Integer.parseInt(elem.get(j).child(1).child(8).text());
                    double WPCT =Double.parseDouble(elem.get(j).child(1).child(9).text());
                    int TBF =Integer.parseInt(elem.get(j).child(1).child(10).text());
                    String IP = elem.get(j).child(1).child(11).text();
                    int H =Integer.parseInt(elem.get(j).child(1).child(12).text());
                    int HR =Integer.parseInt(elem.get(j).child(1).child(13).text());
                    int BB =Integer.parseInt(elem.get(j).child(1).child(14).text());
                    int HBP =Integer.parseInt(elem.get(j).child(1).child(15).text());
                    int SO =Integer.parseInt(elem.get(j).child(1).child(16).text());
                    int R = Integer.parseInt(elem.get(j).child(1).child(17).text());
                    int ER =Integer.parseInt(elem.get(j).child(1).child(18).text());
                    
                    PV.setBB(BB);
                    PV.setCG(CG);
                    PV.setER(ER);
                    PV.setERA(ERA);
                    PV.setG(G);
                    PV.setH(H);
                    PV.setHLD(HLD);
                    PV.setHBP(HBP);
                    PV.setHR(HR);
                    PV.setIP(IP);
                    PV.setL(L);
                    PV.setR(R);
                    PV.setSHO(SHO);
                    PV.setSO(SO);
                    PV.setSV(SV);
                    PV.setTBF(TBF);
                    PV.setW(W);
                    PV.setWPCT(WPCT);
                }
                System.out.println(PV.toString());
 
        }
        
 
            }
        
 
    
 
}
 

