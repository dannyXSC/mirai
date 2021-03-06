package net.mamoe.mirai.message;

/**
 * @author LamGC
 * @author Him188moe
 */
public enum FaceID {
    unknown(0xff),

    Face_jingya(0),
    Face_piezui(1),
    Face_se(2),
    Face_fadai(3),
    Face_deyi(4),
    Face_liulei(5),
    Face_haixiu(6),
    Face_bizui(7),
    Face_shui(8),
    Face_daku(9),
    Face_ganga(10),
    Face_fanu(11),
    Face_tiaopi(12),
    Face_ciya(13),
    Face_weixiao(14),
    Face_nanguo(15),
    Face_ku(16),
    Face_zhuakuang(18),
    Face_tu(19),
    Face_touxiao(20),
    Face_keai(21),
    Face_baiyan(22),
    Face_aoman(23),
    Face_ji_e(24),
    Face_kun(25),
    Face_jingkong(26),
    Face_liuhan(27),
    Face_hanxiao(28),
    Face_dabing(29),
    Face_fendou(30),
    Face_zhouma(31),
    Face_yiwen(32),
    Face_yun(34),
    Face_zhemo(35),
    Face_shuai(36),
    Face_kulou(37),
    Face_qiaoda(38),
    Face_zaijian(39),
    Face_fadou(41),
    Face_aiqing(42),
    Face_tiaotiao(43),
    Face_zhutou(46),
    Face_yongbao(49),
    Face_dan_gao(53),
    Face_shandian(54),
    Face_zhadan(55),
    Face_dao(56),
    Face_zuqiu(57),
    Face_bianbian(59),
    Face_kafei(60),
    Face_fan(61),
    Face_meigui(63),
    Face_diaoxie(64),
    Face_aixin(66),
    Face_xinsui(67),
    Face_liwu(69),
    Face_taiyang(74),
    Face_yueliang(75),
    Face_qiang(76),
    Face_ruo(77),
    Face_woshou(78),
    Face_shengli(79),
    Face_feiwen(85),
    Face_naohuo(86),
    Face_xigua(89),
    Face_lenghan(96),
    Face_cahan(97),
    Face_koubi(98),
    Face_guzhang(99),
    Face_qiudale(100),
    Face_huaixiao(101),
    Face_zuohengheng(102),
    Face_youhengheng(103),
    Face_haqian(104),
    Face_bishi(105),
    Face_weiqu(106),
    Face_kuaikule(107),
    Face_yinxian(108),
    Face_qinqin(109),
    Face_xia(110),
    Face_kelian(111),
    Face_caidao(112),
    Face_pijiu(113),
    Face_lanqiu(114),
    Face_pingpang(115),
    Face_shiai(116),
    Face_piaochong(117),
    Face_baoquan(118),
    Face_gouyin(119),
    Face_quantou(120),
    Face_chajin(121),
    Face_aini(122),
    Face_bu(123),
    Face_hao(124),
    Face_zhuanquan(125),
    Face_ketou(126),
    Face_huitou(127),
    Face_tiaosheng(128),
    Face_huishou(129),
    Face_jidong(130),
    Face_jiewu(131),
    Face_xianwen(132),
    Face_zuotaiji(133),
    Face_youtaiji(134),
    Face_shuangxi(136),
    Face_bianpao(137),
    Face_denglong(138),
    Face_facai(139),
    Face_K_ge(140),
    Face_gouwu(141),
    Face_youjian(142),
    Face_shuai_qi(143),
    Face_hecai(144),
    Face_qidao(145),
    Face_baojin(146),
    Face_bangbangtang(147),
    Face_he_nai(148),
    Face_xiamian(149),
    Face_xiangjiao(150),
    Face_feiji(151),
    Face_kaiche(152),
    Face_gaotiezuochetou(153),
    Face_chexiang(154),
    Face_gaotieyouchetou(155),
    Face_duoyun(156),
    Face_xiayu(157),
    Face_chaopiao(158),
    Face_xiongmao(159),
    Face_dengpao(160),
    Face_fengche(161),
    Face_naozhong(162),
    Face_dasan(163),
    Face_caiqiu(164),
    Face_zuanjie(165),
    Face_shafa(166),
    Face_zhijin(167),
    Face_yao(168),
    Face_shouqiang(169),
    Face_qingwa(170),

    // TODO: 2019/9/1 添加更多表情

    ;

    private final int id;

    FaceID(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static FaceID ofId(int id) {
        for (FaceID value : FaceID.values()) {
            if (value.id == id) {
                return value;
            }
        }
        return FaceID.unknown;
    }


}
