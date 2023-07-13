package api.collection2;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {
public static void main(String[] args) {
	Set<String>a = Set.of("범죄도시3","늑대사냥","드림","퍼펙트게임");
	Set<String>b = Set.of("파수꾼","늑대사냥","리바운드","익스트랙션2","드림");
	
	//[1]둘 다 본 영화를 구하시오(교집합)
	Set<String> both = new TreeSet<>();
	both.addAll(a);
	both.retainAll(b);
	System.out.println("둘 다 본 영화"+both);
	


	//[2] 둘 중 한명만 본 영화를 구하시오
	//(1) (a - b) ∪ (b - a)
	//(2) (a ∪ b) - (a ∩ b)

	//(1)
	Set<String> a_b = new HashSet<>();
	a_b.addAll(a);
	a_b.removeAll(b);
	Set<String> b_a = new HashSet<>();
	b_a.addAll(b);
	b_a.removeAll(a);
	Set<String> result1 = new HashSet<>();
	result1.addAll(a_b);
	result1.addAll(b_a);
	System.out.println("둘 중 한명만 본 영화 = " + result1);

	//(2)
	Set<String> all = new HashSet<>();
	all.addAll(a);
	all.addAll(b);
	all.removeAll(both);
	System.out.println("둘 중 한명만 본 영화 = " + all);

	//Set도 전체 출력이 되긴 된다
	//= 확장반복(foreach)은 가능

	for(String name : all) {
		System.out.println("name = " + name);
	}
}
}