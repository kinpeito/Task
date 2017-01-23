package com.appspot.wwwwgame;

public final class SentenceHelper {
	private SentenceHelper() { }

	private static final String[] whenList={"去年","昨日","先月","紀元前","いまさっき"};
	private static final String[] whereList={"自宅で","近くの城で","世界のまんなかで","追い込み中の戦闘で","ここで"};
	private static final String[] whoList={"わたしが","あなたが","伝説のあなたが","憧れのアイドルが","神が"};
	private static final String[] whatList={"「ザラキ」を唱えたが何も起きなかった。","仲間に加わった","進化した","レベルアップした","脱いだ"};

	public static String makeSentence(String when,String where, String who,String what){
	StringBuilder builder=new StringBuilder();
	builder.append("".equals(when) ? choice(whenList) : when).append(" ");
	builder.append("".equals(where) ? choice(whereList) : where).append(" ");
	builder.append("".equals(who) ? choice(whoList) : who).append(" ");
	builder.append("".equals(what) ? choice(whatList) : what);
	return builder.toString();
	}

	private static String choice(String[] list){
		return list[(int) (Math.random()*list.length)];
	}
}