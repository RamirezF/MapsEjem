package com.example.mapsejem;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Camera;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mapsejem.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private GoogleMap cMap;
    private MarkerOptions cmarker;
    private MarkerOptions campoy;
    private Marker chosica_marker;
    private Marker campoy_marker;
    private ActivityMapsBinding binding;
    private Polygon choLoc;
    private Polygon campoyLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        ChosicaMap(googleMap);
        campoyMap(googleMap);
    }

    public void ChosicaMap(GoogleMap googleMap)
    {
        // Add a marker in Sydney and move the camera
        LatLng chosica = new LatLng(-11.92580746725925, -76.68585551121954);           //     CHOSICA
        LatLng sydney = new LatLng(-34, 151);

        CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
        cmarker = new MarkerOptions();
        cmarker.position(chosica);
        cmarker.title("CHOSICA");
        cmarker.snippet("chosiquita");
        cmarker.icon(BitmapDescriptorFactory.fromResource(android.R.drawable.star_on));            // android.R.drawable.star_on
        chosica_marker = mMap.addMarker(cmarker);

        // Polígono Local 23 (Completo) CHOSICA
        final LatLng cho_01 = new LatLng(-11.924422076093817, -76.68757473871402);
        final LatLng cho_02 = new LatLng(-11.924276552200546, -76.68703757858921);
        final LatLng cho_03 = new LatLng(-11.901017757473127, -76.66686963575795);
        final LatLng cho_04 = new LatLng(-11.89967098073152, -76.66575454764761);
        final LatLng cho_05 = new LatLng(-11.898584267272069, -76.66245590739172);
        final LatLng cho_06 = new LatLng(-11.915362764633821, -76.66659568238433);
        final LatLng cho_07 = new LatLng(-11.919067686854278, -76.66603426056109);
        final LatLng cho_08 = new LatLng(-11.920464023192299, -76.6639420938972);
        final LatLng cho_09 = new LatLng(-11.918319365794007, -76.65193214869748);
        final LatLng cho_10 = new LatLng(-11.920009046885886, -76.64921808692876);
        final LatLng cho_11 = new LatLng(-11.91224300925031, -76.61147873110468);
        final LatLng cho_12 = new LatLng(-11.913796534767963, -76.60729481576396);
        final LatLng cho_13 = new LatLng(-11.927597539277457, -76.60875437528036);
        final LatLng cho_14 = new LatLng(-11.926316560543535, -76.61096473110454);
        final LatLng cho_15 = new LatLng(-11.926316560543535, -76.61096473110454);
        final LatLng cho_16 = new LatLng(-11.916008034027278, -76.61549264644539);
        final LatLng cho_17 = new LatLng(-11.923755547407096, -76.63010508692871);
        final LatLng cho_18 = new LatLng(-11.929005545935638, -76.66236135809338);
        final LatLng cho_19 = new LatLng(-11.92899682200261, -76.67827448044292);
        final LatLng cho_20 = new LatLng(-11.935609563282211, -76.68506600226931);
        final LatLng cho_21 = new LatLng(-11.950431087579187, -76.70042945993943);
        final LatLng cho_22 = new LatLng(-11.949402086542532, -76.71046083295059);
        final LatLng cho_23 = new LatLng(-11.951592096239034, -76.7213419176097);
        final LatLng cho_24 = new LatLng(-11.953513067776978, -76.72885208692837);
        final LatLng cho_25 = new LatLng(-11.967021095618525, -76.74472017158745);
        final LatLng cho_26 = new LatLng(-11.963630562995476, -76.75138327343382);
        final LatLng cho_27 = new LatLng(-11.960451831397219, -76.75052656510212);
        final LatLng cho_28 = new LatLng(-11.951792555195482, -76.74796281576363);
        final LatLng cho_29 = new LatLng(-11.951792555195482, -76.74796281576363);
        final LatLng cho_30 = new LatLng(-11.949720057499425, -76.73110735809317);
        final LatLng cho_31 = new LatLng(-11.944682074835915, -76.73471191760977);
        final LatLng cho_32 = new LatLng(-11.943212563214937, -76.73422900226916);
        final LatLng cho_33 = new LatLng(-11.941428065112843, -76.73164327343409);
        final LatLng cho_34 = new LatLng(-11.942057562288262, -76.72609645964401);
        final LatLng cho_35 = new LatLng(-11.946571062398384, -76.7222988157636);
        final LatLng cho_36 = new LatLng(-11.942336326219477, -76.71561837859667);
        final LatLng cho_37 = new LatLng(-11.931540574589828, -76.7202783525459);
        final LatLng cho_38 = new LatLng(-11.930825895285587, -76.71866073139533);
        final LatLng cho_39 = new LatLng(-11.931164710482069, -76.71747971781498);
        final LatLng cho_40 = new LatLng(-11.935665232151043, -76.71266720594791);
        final LatLng cho_41 = new LatLng(-11.939148863010166, -76.70666315977395);
        final LatLng cho_42 = new LatLng(-11.934296931463413, -76.70548967825846);
        final LatLng cho_43 = new LatLng(-11.923587430719016, -76.70275855795973);
        final LatLng cho_44 = new LatLng(-11.926023439480822, -76.70121692685511);
        final LatLng cho_45 = new LatLng(-11.928563500068563, -76.70091700226934);
        final LatLng cho_46 = new LatLng(-11.936656507316922, -76.70108845993953);
        final LatLng cho_47 = new LatLng(-11.92981250598516, -76.69553091748134);

        PolygonOptions cho_loc = new PolygonOptions()
                .add(cho_01)
                .add(cho_02)
                .add(cho_03)
                .add(cho_04)
                .add(cho_05)
                .add(cho_06)
                .add(cho_07)
                .add(cho_08)
                .add(cho_09)
                .add(cho_10)
                .add(cho_11)
                .add(cho_12)
                .add(cho_13)
                .add(cho_14)
                .add(cho_15)
                .add(cho_16)
                .add(cho_17)
                .add(cho_18)
                .add(cho_19)
                .add(cho_20)
                .add(cho_21)
                .add(cho_22)
                .add(cho_23)
                .add(cho_24)
                .add(cho_25)
                .add(cho_26)
                .add(cho_27)
                .add(cho_28)
                .add(cho_29)
                .add(cho_30)
                .add(cho_31)
                .add(cho_32)
                .add(cho_33)
                .add(cho_34)
                .add(cho_35)
                .add(cho_36)
                .add(cho_37)
                .add(cho_38)
                .add(cho_39)
                .add(cho_40)
                .add(cho_41)
                .add(cho_42)
                .add(cho_43)
                .add(cho_44)
                .add(cho_45)
                .add(cho_46)
                .add(cho_47);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        choLoc = mMap.addPolygon(cho_loc);
        choLoc.setClickable(true);
        choLoc.setTag("chosica");
        mMap.addPolygon(cho_loc);

        // Tocar un Polígono
        /*mMap.setOnPolygonClickListener(new GoogleMap.OnPolygonClickListener() {
            @Override
            public void onPolygonClick(Polygon polygon) {
                if (polygon.getTag()=="campoy") {
                    Toast.makeText(MapsActivity.this, "Saludos Campoy", Toast.LENGTH_SHORT).show();
                    polygon.setFillColor(0x0027FF);
                    polygon.setStrokeColor(0x33001fff);
                }
                else if (polygon.getTag() == "chosica")
                {
                    Toast.makeText(MapsActivity.this, "Saludos Chosica", Toast.LENGTH_SHORT).show();
                    polygon.setFillColor(0x332aff00);
                    polygon.setStrokeColor(0x332aff00);
                }
            }
        });*/


        // Evento al presionar el marcador

        mMap.setOnMarkerClickListener(new OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                if(marker.equals(chosica_marker)){
                    Toast.makeText(MapsActivity.this, "Marcador de " + marker.getTitle(), Toast.LENGTH_SHORT).show();
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    choLoc.setFillColor(0x332aff00);
                    choLoc.setStrokeColor(0x332aff00);
                    return true;
                }else if(marker.equals(campoy_marker)){
                    Toast.makeText(MapsActivity.this, "Marcador de " + marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x332aff00);
                    campoyLoc.setStrokeColor(0x332aff00);
                    return true;
                }
                return false;
            }
        });

        // Posición de Cámara principal
        CameraPosition camera = new CameraPosition.Builder()
                .target(chosica)                                    //local21
                .zoom(11)
                .bearing(345)
                .tilt(30)
                .build();
/*
        final LatLng carapongo_01 = new LatLng();
        PolygonOptions carap_Loc = new PolygonOptions()
                .add(carapongo_01)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        Polygon carapLoc = mMap.addPolygon(carap_Loc);
*/
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(camera));

    }

    public void campoyMap(GoogleMap googleMap){
        cMap = googleMap;
        final LatLng local24 = new LatLng(-12.024076387091215, -76.97699645338558);
        campoy = new MarkerOptions();
        campoy.position(local24);
        campoy.title("CAMPOY");
        campoy.snippet("Camposito");
        campoy.icon(BitmapDescriptorFactory.fromResource(android.R.drawable.star_on));
        campoy_marker = mMap.addMarker(campoy);

        // Polígono Local 24    CAMPOY
        final LatLng p2401 = new LatLng(-12.024076387091215, -76.97699645338558);
        final LatLng p2402 = new LatLng(-12.025680557676722, -76.97724008138084);
        final LatLng p2403 = new LatLng(-12.026128210136523, -76.96978114416606);
        final LatLng p2404 = new LatLng(-12.020127632211087, -76.9525941634469);
        final LatLng p2405 = new LatLng(-12.019997757697451, -76.9523290899433);
        final LatLng p2406 = new LatLng(-12.019003644168126, -76.95208180289056);
        final LatLng p2407 = new LatLng(-12.019133117127284, -76.95283462984997);
        final LatLng p2408 = new LatLng(-12.01884946857254, -76.9533054419027);
        final LatLng p2409 = new LatLng(-12.0188811292306, -76.95615582226341);
        final LatLng p2410 = new LatLng(-12.017781622890613, -76.95641072902673);
        final LatLng p2411 = new LatLng(-12.017715192358535, -76.95754560806326);
        final LatLng p2412 = new LatLng(-12.015522244760904, -76.95995373807278);
        final LatLng p2413 = new LatLng(-12.006785957705485, -76.95469928275062);
        final LatLng p2414 = new LatLng(-12.003427485742813, -76.9557830022685);
        final LatLng p2415 = new LatLng(-12.006353363145884, -76.95701236506174);
        final LatLng p2416 = new LatLng(-12.00709832193052, -76.96047108097797);
        final LatLng p2417 = new LatLng(-12.006678579660223, -76.96422608692784);
        final LatLng p2418 = new LatLng(-12.009315172996113, -76.96694836786398);
        final LatLng p2419 = new LatLng(-12.012755272311644, -76.96811580162259);
        final LatLng p2420 = new LatLng(-12.013510677273741, -76.96894190739138);
        final LatLng p2421 = new LatLng(-12.01753737784867, -76.9692837399887);
        final LatLng p2422 = new LatLng(-12.016640269794266, -76.97206800064413);
        final LatLng p2423 = new LatLng(-12.018466023211136, -76.97558144972099);
        final LatLng p2424 = new LatLng(-12.021249867287713, -76.97747694527088);
        final LatLng p2425 = new LatLng(-12.021655941560219, -76.97960204711829);
        final LatLng p2426 = new LatLng(-12.022820510992632, -76.98160800226827);
        final LatLng p2427 = new LatLng(-12.020931562240207, -76.98411854459803);
        final LatLng p2428 = new LatLng(-12.021068017226103, -76.98625190042196);
        final LatLng p2429 = new LatLng(-12.019982037722558, -76.99055043720492);
        final LatLng p2430 = new LatLng(-12.021146738211709, -76.99094236506174);
        final LatLng p2431 = new LatLng(-12.022288452063679, -76.99152515039287);
        final LatLng p2432 = new LatLng(-12.026532067024165, -76.99130646196787);
        final LatLng p2433 = new LatLng(-12.026434921639837, -76.98815682500786);

        PolygonOptions laland1 = new PolygonOptions()
                //.add(p2401)  Local
                .add(p2402)
                .add(p2403)
                .add(p2404)
                .add(p2405)
                .add(p2406)
                .add(p2407)
                .add(p2408)
                .add(p2409)
                .add(p2410)
                .add(p2411)
                .add(p2412)
                .add(p2413)
                .add(p2414)
                .add(p2415)
                .add(p2416)
                .add(p2417)
                .add(p2418)
                .add(p2419)
                .add(p2420)
                .add(p2421)
                .add(p2422)
                .add(p2423)
                .add(p2424)
                .add(p2425)
                .add(p2426)
                .add(p2427)
                .add(p2428)
                .add(p2429)
                .add(p2430)
                .add(p2431)
                .add(p2432)
                .add(p2433);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        campoyLoc = cMap.addPolygon(laland1);
        campoyLoc.setClickable(true);
        campoyLoc.setTag("campoy");
        cMap.addPolygon(laland1);


//**************************************************************************************************************************************************************************
        /*
        int COLOR_BLUE_ARGB = 0xffF9A825;
        // Add polygons to indicate areas on the map.
        Polygon polygon1 = googleMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(p2402, p2409, p2413, p2424));
        // Store a data object with the polygon, used here to indicate an arbitrary type.
        polygon1.setTag("alpha");
        polygon1.setFillColor(COLOR_BLUE_ARGB);
        */
//**************************************************************************************************************************************************************************
    }

}