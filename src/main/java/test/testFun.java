package test;

import com.zy.rank.core.base.RankData;
import com.zy.rank.service.IRankService;
import com.zy.rank.service.RankService;


public class testFun {

	public static void main(String[] args) {
		//创建一个排行榜
		IRankService rankService = new RankService();
	    rankService.createRank("rankName");
	    rankService.put("rankName", 10, 100); // put date to rank
	   
	    RankData rankData = rankService.getRankDataById("rankName", 10); // get date by id
	    int rankNum = rankData.getRankNum(); // get rank num
	    System.out.println(rankNum);
	    
	    rankService.put("rankName", 22, 200); // put date to rank
	    RankData rankData1 = rankService.getRankDataById("rankName", 22); // get date by id
	    int rankNum1 = rankData1.getRankNum(); // get rank num
	    System.out.println(rankNum1);
	    RankData rankData2 = rankService.getRankDataByRankNum("rankName", rankNum); // get date by rankNum
	    System.out.println(rankData2);
//	    List<RankData> rankDataList1 = rankService.getRankDatasAroundId("rankName", 30, 3, 6); // get date by id,and ranks around this id
//	    System.out.println(rankDataList1.size());
//	    List<RankData> rankDataList2 = rankService.getRankDatasByPage("rankName", 7/*page*/, 9/*pageSize*/); // get date by page
//	    System.out.println(rankDataList2.size());
	}

}
