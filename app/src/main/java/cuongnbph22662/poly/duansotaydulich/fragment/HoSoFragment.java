package cuongnbph22662.poly.duansotaydulich.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import cuongnbph22662.poly.duansotaydulich.DangNhapSuccess;
import cuongnbph22662.poly.duansotaydulich.activity.TaoTaiKhoanActivity;
import cuongnbph22662.poly.duansotaydulich.activity.DangNhapActivity;
import cuongnbph22662.poly.duansotaydulich.R;
import cuongnbph22662.poly.duansotaydulich.activity.TTCaNhanActivity;

public class HoSoFragment extends Fragment {
    Button btnDangNhap;
    TextView tvTaoTaiKhoan;
    LinearLayout lienHe, theoDoi, dieuKhoan, quyenRiengTu,ExitDangNhap;
    Context context;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ho_so, container, false);
        btnDangNhap = view.findViewById(R.id.btnDangNhap);
        tvTaoTaiKhoan = view.findViewById(R.id.tvDangKi);
        lienHe = view.findViewById(R.id.id_lienHe);
        theoDoi = view.findViewById(R.id.id_theoDoi);
        ExitDangNhap = view.findViewById(R.id.exitDangNhap);
        dieuKhoan = view.findViewById(R.id.id_dieuKhoan);
        quyenRiengTu = view.findViewById(R.id.id_quyenRiengTu);
        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DangNhapActivity.class);
                startActivity(intent);
            }
        });
        tvTaoTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TaoTaiKhoanActivity.class);
                startActivity(intent);
            }
        });
        lienHe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TTCaNhanActivity.class);
                startActivity(intent);
            }
        });
        Intent intent = getActivity().getIntent();
        String t = intent.getStringExtra("user");
        String kt = "all";
        if (kt.equals(t)){
            ExitDangNhap.setVisibility(View.GONE);
        }


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}