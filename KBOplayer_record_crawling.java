package ahahah.control;
 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
 
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
                    PV.setHPB(HBP);
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
 

