package br.com.dyuki.persistenciadedados

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        var id = v?.id
        var dado = edtDado.editableText.toString()
        when(id){
            R.id.btnGravar -> {
                if (dado.trim().isNotEmpty()){
                    meuEditor.putString("dado", dado).commit()
                    edtDado.setText("")
                }
            }
            R.id.btnResgatar -> {

            }
        }

    }

    //Importante !!
    //Declarar -> Vincular -> Usar

    //DECLARAR -> Criando Variável Global(privada)
    private lateinit var minhaPreferencia   : SharedPreferences
    private lateinit var meuEditor          : SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //VINCULAR ou INSTANCIAR
        minhaPreferencia = getSharedPreferences("SharedApp", Context.MODE_PRIVATE)
        meuEditor = minhaPreferencia.edit()

        btnGravar.setOnClickListener(this)
        btnResgatar.setOnClickListener(this)

    }
}
