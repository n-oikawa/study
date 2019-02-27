package study02.nyukai_taikai.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import study02.nyukai_taikai.domain.nyukai.MemberNyukai;
import study02.nyukai_taikai.domain.nyukai.NyukaiRepository;

@Repository
public class NyukaiRepositoryEvent implements NyukaiRepository {

    @Autowired
    private NyukaiMapper nyukaiMapper;

    public void save(MemberNyukai memberNyukai) {
        nyukaiMapper.insert(
                memberNyukai.getMemberAccount().getMemberId().getValue(),
                memberNyukai.getMemberAccount().getPassWord().getValue(),
                memberNyukai.getNyukaiApplyDate().getValue(),
                memberNyukai.getMemberMailAddress().getValue());
    }

}
