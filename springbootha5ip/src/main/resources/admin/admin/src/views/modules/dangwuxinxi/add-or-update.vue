<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'" label="支部账号" prop="zhibuzhanghao">
          <el-select :disabled="ro.zhibuzhanghao" @change="zhibuzhanghaoChange" v-model="ruleForm.zhibuzhanghao" placeholder="请选择支部账号">
            <el-option
                v-for="(item,index) in zhibuzhanghaoOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input"v-if="ruleForm.zhibuzhanghao" label="支部账号" prop="zhibuzhanghao">
              <el-input v-model="ruleForm.zhibuzhanghao" 
                placeholder="支部账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="委员姓名" prop="weiyuanxingming">
          <el-input v-model="ruleForm.weiyuanxingming" 
              placeholder="委员姓名" clearable  :readonly="ro.weiyuanxingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="委员姓名" prop="weiyuanxingming">
              <el-input v-model="ruleForm.weiyuanxingming" 
                placeholder="委员姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="支部名称" prop="zhibumingcheng">
          <el-input v-model="ruleForm.zhibumingcheng" 
              placeholder="支部名称" clearable  :readonly="ro.zhibumingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="支部名称" prop="zhibumingcheng">
              <el-input v-model="ruleForm.zhibumingcheng" 
                placeholder="支部名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="select" v-if="type!='info'"  label="身份" prop="shenfen">
          <el-select :disabled="ro.shenfen" v-model="ruleForm.shenfen" placeholder="请选择身份">
            <el-option
                v-for="(item,index) in shenfenOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="身份" prop="shenfen">
	      <el-input v-model="ruleForm.shenfen"
                placeholder="身份" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="学号" prop="xuehao">
          <el-input v-model="ruleForm.xuehao" 
              placeholder="学号" clearable  :readonly="ro.xuehao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="学号" prop="xuehao">
              <el-input v-model="ruleForm.xuehao" 
                placeholder="学号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming" 
              placeholder="姓名" clearable  :readonly="ro.xingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="姓名" prop="xingming">
              <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="班级" prop="banji">
          <el-input v-model="ruleForm.banji" 
              placeholder="班级" clearable  :readonly="ro.banji"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="班级" prop="banji">
              <el-input v-model="ruleForm.banji" 
                placeholder="班级" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="性别" prop="xingbie">
          <el-input v-model="ruleForm.xingbie" 
              placeholder="性别" clearable  :readonly="ro.xingbie"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="性别" prop="xingbie">
              <el-input v-model="ruleForm.xingbie" 
                placeholder="性别" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="民族" prop="minzu">
          <el-input v-model="ruleForm.minzu" 
              placeholder="民族" clearable  :readonly="ro.minzu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="民族" prop="minzu">
              <el-input v-model="ruleForm.minzu" 
                placeholder="民族" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="籍贯" prop="jiguan">
          <el-input v-model="ruleForm.jiguan" 
              placeholder="籍贯" clearable  :readonly="ro.jiguan"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="籍贯" prop="jiguan">
              <el-input v-model="ruleForm.jiguan" 
                placeholder="籍贯" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="身份证号" prop="shenfenzhenghao">
          <el-input v-model="ruleForm.shenfenzhenghao" 
              placeholder="身份证号" clearable  :readonly="ro.shenfenzhenghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="身份证号" prop="shenfenzhenghao">
              <el-input v-model="ruleForm.shenfenzhenghao" 
                placeholder="身份证号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi" 
              placeholder="联系方式" clearable  :readonly="ro.lianxifangshi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="联系方式" prop="lianxifangshi">
              <el-input v-model="ruleForm.lianxifangshi" 
                placeholder="联系方式" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="培养联系人" prop="peiyanglianxiren">
          <el-input v-model="ruleForm.peiyanglianxiren" 
              placeholder="培养联系人" clearable  :readonly="ro.peiyanglianxiren"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="培养联系人" prop="peiyanglianxiren">
              <el-input v-model="ruleForm.peiyanglianxiren" 
                placeholder="培养联系人" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="入团介绍人" prop="rudangjieshaoren">
          <el-input v-model="ruleForm.rudangjieshaoren" 
              placeholder="入团介绍人" clearable  :readonly="ro.rudangjieshaoren"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="入团介绍人" prop="rudangjieshaoren">
              <el-input v-model="ruleForm.rudangjieshaoren" 
                placeholder="入团介绍人" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="24">  
        <el-form-item class="upload" v-if="type!='info' && !ro.touxiang" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="touxiangUploadChange"
          ></file-upload>
        </el-form-item>
        <div v-else>
          <el-form-item v-if="ruleForm.touxiang" label="头像" prop="touxiang">
            <img style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.touxiang.split(',')" :src="$base.url+item" width="100" height="100">
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="确定拟发展对象时间" prop="quedingnifazhanduixiangshijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.quedingnifazhanduixiangshijian" 
                type="date"
                :readonly="ro.quedingnifazhanduixiangshijian"
                placeholder="确定拟发展对象时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.quedingnifazhanduixiangshijian" label="确定拟发展对象时间" prop="quedingnifazhanduixiangshijian">
              <el-input v-model="ruleForm.quedingnifazhanduixiangshijian" 
                placeholder="确定拟发展对象时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="申请入团时间" prop="shenqingrudangshijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.shenqingrudangshijian" 
                type="date"
                :readonly="ro.shenqingrudangshijian"
                placeholder="申请入团时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.shenqingrudangshijian" label="申请入团时间" prop="shenqingrudangshijian">
              <el-input v-model="ruleForm.shenqingrudangshijian" 
                placeholder="申请入团时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="确定积极分子时间" prop="quedingjijifenzishijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.quedingjijifenzishijian" 
                type="date"
                :readonly="ro.quedingjijifenzishijian"
                placeholder="确定积极分子时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.quedingjijifenzishijian" label="确定积极分子时间" prop="quedingjijifenzishijian">
              <el-input v-model="ruleForm.quedingjijifenzishijian" 
                placeholder="确定积极分子时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="接收为预备团员时间" prop="jieshouweiyubeidangyuanshijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.jieshouweiyubeidangyuanshijian" 
                type="date"
                :readonly="ro.jieshouweiyubeidangyuanshijian"
                placeholder="接收为预备团员时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.jieshouweiyubeidangyuanshijian" label="接收为预备团员时间" prop="jieshouweiyubeidangyuanshijian">
              <el-input v-model="ruleForm.jieshouweiyubeidangyuanshijian" 
                placeholder="接收为预备团员时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="转正时间" prop="zhuanzhengshijian">
            <el-date-picker
                format="yyyy 年 MM 月 dd 日"
                value-format="yyyy-MM-dd"
                v-model="ruleForm.zhuanzhengshijian" 
                type="date"
                :readonly="ro.zhuanzhengshijian"
                placeholder="转正时间">
            </el-date-picker> 
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.zhuanzhengshijian" label="转正时间" prop="zhuanzhengshijian">
              <el-input v-model="ruleForm.zhuanzhengshijian" 
                placeholder="转正时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(167, 164, 164, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"4px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"rgba(238, 238, 238, 0.68)","dateIconFontSize":"14px","btnSaveBgColor":"rgba(105, 106, 106, 1)","uploadIconFontColor":"rgba(146, 143, 126, 0.71)","textareaBorderColor":"#DCDFE6","btnCancelBgColor":"rgba(231, 231, 231, 0.78)","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"#C0C4CC","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"#606266","dateBorderColor":"#DCDFE6","dateIconFontColor":"#C0C4CC","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"4px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"#DCDFE6","inputBorderColor":"#DCDFE6","uploadBorderColor":"#DCDFE6","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(255, 255, 255, 1)","btnSaveBorderWidth":"1px"},
      id: '',
      type: '',
      ro:{
	zhibuzhanghao : false,
	weiyuanxingming : false,
	zhibumingcheng : false,
	shenfen : false,
	xuehao : false,
	xingming : false,
	banji : false,
	xingbie : false,
	minzu : false,
	jiguan : false,
	shenfenzhenghao : false,
	lianxifangshi : false,
	peiyanglianxiren : false,
	rudangjieshaoren : false,
	touxiang : false,
	quedingnifazhanduixiangshijian : false,
	shenqingrudangshijian : false,
	quedingjijifenzishijian : false,
	jieshouweiyubeidangyuanshijian : false,
	zhuanzhengshijian : false,
      },
      ruleForm: {
        zhibuzhanghao: '',
        weiyuanxingming: '',
        zhibumingcheng: '',
        shenfen: '',
        xuehao: '',
        xingming: '',
        banji: '',
        xingbie: '',
        minzu: '',
        jiguan: '',
        shenfenzhenghao: '',
        lianxifangshi: '',
        peiyanglianxiren: '',
        rudangjieshaoren: '',
        touxiang: '',
        quedingnifazhanduixiangshijian: '',
        shenqingrudangshijian: '',
        quedingjijifenzishijian: '',
        jieshouweiyubeidangyuanshijian: '',
        zhuanzhengshijian: '',
      },
          zhibuzhanghaoOptions: [],
          shenfenOptions: [],
      rules: {
          zhibuzhanghao: [
                { required: true, message: '支部账号不能为空', trigger: 'blur' },
          ],
          weiyuanxingming: [
          ],
          zhibumingcheng: [
                { required: true, message: '支部名称不能为空', trigger: 'blur' },
          ],
          shenfen: [
          ],
          xuehao: [
          ],
          xingming: [
          ],
          banji: [
          ],
          xingbie: [
          ],
          minzu: [
          ],
          jiguan: [
          ],
          shenfenzhenghao: [
          ],
          lianxifangshi: [
          ],
          peiyanglianxiren: [
          ],
          rudangjieshaoren: [
          ],
          touxiang: [
          ],
          quedingnifazhanduixiangshijian: [
          ],
          shenqingrudangshijian: [
          ],
          quedingjijifenzishijian: [
          ],
          jieshouweiyubeidangyuanshijian: [
          ],
          zhuanzhengshijian: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {



  },
  created() {
	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='zhibuzhanghao'){
            this.ruleForm.zhibuzhanghao = obj[o];
	    this.ro.zhibuzhanghao = true;
            continue;
          }
          if(o=='weiyuanxingming'){
            this.ruleForm.weiyuanxingming = obj[o];
	    this.ro.weiyuanxingming = true;
            continue;
          }
          if(o=='zhibumingcheng'){
            this.ruleForm.zhibumingcheng = obj[o];
	    this.ro.zhibumingcheng = true;
            continue;
          }
          if(o=='shenfen'){
            this.ruleForm.shenfen = obj[o];
	    this.ro.shenfen = true;
            continue;
          }
          if(o=='xuehao'){
            this.ruleForm.xuehao = obj[o];
	    this.ro.xuehao = true;
            continue;
          }
          if(o=='xingming'){
            this.ruleForm.xingming = obj[o];
	    this.ro.xingming = true;
            continue;
          }
          if(o=='banji'){
            this.ruleForm.banji = obj[o];
	    this.ro.banji = true;
            continue;
          }
          if(o=='xingbie'){
            this.ruleForm.xingbie = obj[o];
	    this.ro.xingbie = true;
            continue;
          }
          if(o=='minzu'){
            this.ruleForm.minzu = obj[o];
	    this.ro.minzu = true;
            continue;
          }
          if(o=='jiguan'){
            this.ruleForm.jiguan = obj[o];
	    this.ro.jiguan = true;
            continue;
          }
          if(o=='shenfenzhenghao'){
            this.ruleForm.shenfenzhenghao = obj[o];
	    this.ro.shenfenzhenghao = true;
            continue;
          }
          if(o=='lianxifangshi'){
            this.ruleForm.lianxifangshi = obj[o];
	    this.ro.lianxifangshi = true;
            continue;
          }
          if(o=='peiyanglianxiren'){
            this.ruleForm.peiyanglianxiren = obj[o];
	    this.ro.peiyanglianxiren = true;
            continue;
          }
          if(o=='rudangjieshaoren'){
            this.ruleForm.rudangjieshaoren = obj[o];
	    this.ro.rudangjieshaoren = true;
            continue;
          }
          if(o=='touxiang'){
            this.ruleForm.touxiang = obj[o];
	    this.ro.touxiang = true;
            continue;
          }
          if(o=='quedingnifazhanduixiangshijian'){
            this.ruleForm.quedingnifazhanduixiangshijian = obj[o];
	    this.ro.quedingnifazhanduixiangshijian = true;
            continue;
          }
          if(o=='shenqingrudangshijian'){
            this.ruleForm.shenqingrudangshijian = obj[o];
	    this.ro.shenqingrudangshijian = true;
            continue;
          }
          if(o=='quedingjijifenzishijian'){
            this.ruleForm.quedingjijifenzishijian = obj[o];
	    this.ro.quedingjijifenzishijian = true;
            continue;
          }
          if(o=='jieshouweiyubeidangyuanshijian'){
            this.ruleForm.jieshouweiyubeidangyuanshijian = obj[o];
	    this.ro.jieshouweiyubeidangyuanshijian = true;
            continue;
          }
          if(o=='zhuanzhengshijian'){
            this.ruleForm.zhuanzhengshijian = obj[o];
	    this.ro.zhuanzhengshijian = true;
            continue;
          }
        }
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
        } else {
          this.$message.error(data.msg);
        }
      });
            this.$http({
              url: `option/zhibuweiyuan/zhibuzhanghao`,
              method: "get"
            }).then(({ data }) => {
              if (data && data.code === 0) {
                this.zhibuzhanghaoOptions = data.data;
              } else {
                this.$message.error(data.msg);
              }
            });
            this.shenfenOptions = "积极分子,预备团员,正式团员".split(',')
    },
    // 下二随
    zhibuzhanghaoChange () {
      this.$http({
        url: `follow/zhibuweiyuan/zhibuzhanghao?columnValue=`+ this.ruleForm.zhibuzhanghao,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
              if(data.data.weiyuanxingming){
                this.ruleForm.weiyuanxingming = data.data.weiyuanxingming
              }
              if(data.data.zhibumingcheng){
                this.ruleForm.zhibumingcheng = data.data.zhibumingcheng
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `dangwuxinxi/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {






























	if(this.ruleForm.touxiang!=null) {
		this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
	}











var objcross = this.$storage.getObj('crossObj');

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "dangwuxinxi/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `dangwuxinxi/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.dangwuxinxiCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `dangwuxinxi/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.dangwuxinxiCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.dangwuxinxiCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    touxiangUploadChange(fileUrls) {
	this.ruleForm.touxiang = fileUrls;
	this.addEditUploadStyleChange()
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
