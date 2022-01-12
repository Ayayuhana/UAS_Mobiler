package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Baju;
import simple.example.hewanpedia.model.Pakaian;
import simple.example.hewanpedia.model.Rok;
import simple.example.hewanpedia.model.Celana;

public class DataProvider {
    private static List<Pakaian> pakaians = new ArrayList<>();

    private static List<Rok> initDataRok(Context ctx) {
        List<Rok> roks = new ArrayList<>();
        roks.add(new Rok(ctx.getString(R.string.line),ctx.getString(R.string.sia), ctx.getString(R.string.asal), R.drawable.rokaline));
        roks.add(new Rok(ctx.getString(R.string.sudi), ctx.getString(R.string.pura),
                ctx.getString(R.string.nyaman), R.drawable.rokcircle));
        roks.add(new Rok(ctx.getString(R.string.ring), ctx.getString(R.string.mi),
                ctx.getString(R.string.ana), R.drawable.rokjaring));
        roks.add(new Rok(ctx.getString(R.string.yu), ctx.getString(R.string.as),
                ctx.getString(R.string.ad), R.drawable.rokmaxi));
        roks.add(new Rok(ctx.getString(R.string.jk), ctx.getString(R.string.xc),
                ctx.getString(R.string.cv), R.drawable.rokmini));
        roks.add(new Rok(ctx.getString(R.string.bn), ctx.getString(R.string.ty),
                ctx.getString(R.string.d), R.drawable.roktiered));
        return roks;
    }


    private static List<Baju> initDataBaju(Context ctx) {
        List<Baju> bajus = new ArrayList<>();
        bajus.add(new Baju(ctx.getString(R.string.s), ctx.getString(R.string.f),
                ctx.getString(R.string.y), R.drawable.bajublous));
        bajus.add(new Baju(ctx.getString(R.string.g), ctx.getString(R.string.b),
                ctx.getString(R.string.vb), R.drawable.bajukaos));
        bajus.add(new Baju(ctx.getString(R.string.yuk), ctx.getString(R.string.awan),
                ctx.getString(R.string.serta), R.drawable.bajukemejasalur));
        bajus.add(new Baju(ctx.getString(R.string.war), ctx.getString(R.string.tyu),
                ctx.getString(R.string.nayi), R.drawable.bajumuslimanak));
        bajus.add(new Baju(ctx.getString(R.string.wer), ctx.getString(R.string.drt),
                ctx.getString(R.string.ase), R.drawable.bajuremix));
        bajus.add(new Baju(ctx.getString(R.string.ikk), ctx.getString(R.string.weu),
                ctx.getString(R.string.asert), R.drawable.bajutunik));
        return bajus;
    }

    private static List<Celana> initDataCelana(Context ctx) {
        List<Celana> celanas = new ArrayList<>();
        celanas.add(new Celana(ctx.getString(R.string.qw), ctx.getString(R.string.yuik),
                ctx.getString(R.string.cvb), R.drawable.ccargocewek));
        celanas.add(new Celana(ctx.getString(R.string.dfg), ctx.getString(R.string.zx),
                ctx.getString(R.string.ki), R.drawable.cjeanscowokpendek));
        celanas.add(new Celana(ctx.getString(R.string.der), ctx.getString(R.string.dert),
                ctx.getString(R.string.lok), R.drawable.ckulot));
        celanas.add(new Celana(ctx.getString(R.string.fe), ctx.getString(R.string.mika),
                ctx.getString(R.string.lika), R.drawable.cpendekchinos));
        celanas.add(new Celana(ctx.getString(R.string.ning), ctx.getString(R.string.bg),
                ctx.getString(R.string.kil), R.drawable.ctraining));
        celanas.add(new Celana(ctx.getString(R.string.kol), ctx.getString(R.string.des),
                ctx.getString(R.string.kill), R.drawable.cjeans));
        return celanas;
    }

    private static void initAllPakaians(Context ctx) {
       pakaians.addAll(initDataRok(ctx));
        pakaians.addAll(initDataBaju(ctx));
        pakaians.addAll(initDataCelana(ctx));
    }

    public static List<Pakaian> getAllHewan(Context ctx) {
        if ( pakaians.size() == 0) {
            initAllPakaians(ctx);
        }
        return  pakaians;
    }

    public static List<Pakaian> getPakaiansByTipe(Context ctx, String jenis) {
        List<Pakaian> hewansByType = new ArrayList<>();
        if ( pakaians.size() == 0) {
            initAllPakaians(ctx);
        }
        for (Pakaian h :  pakaians) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
