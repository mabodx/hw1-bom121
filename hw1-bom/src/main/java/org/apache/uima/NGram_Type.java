
/* First created by JCasGen Tue Sep 10 22:48:16 EDT 2013 */
package org.apache.uima;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 10 22:48:16 EDT 2013
 * @generated */
public class NGram_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGram(addr, NGram_Type.this);
  			   NGram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGram(addr, NGram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.apache.uima.NGram");
 
  /** @generated */
  final Feature casFeat_casProcessId;
  /** @generated */
  final int     casFeatCode_casProcessId;
  /** @generated */ 
  public String getCasProcessId(int addr) {
        if (featOkTst && casFeat_casProcessId == null)
      jcas.throwFeatMissing("casProcessId", "org.apache.uima.NGram");
    return ll_cas.ll_getStringValue(addr, casFeatCode_casProcessId);
  }
  /** @generated */    
  public void setCasProcessId(int addr, String v) {
        if (featOkTst && casFeat_casProcessId == null)
      jcas.throwFeatMissing("casProcessId", "org.apache.uima.NGram");
    ll_cas.ll_setStringValue(addr, casFeatCode_casProcessId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_element;
  /** @generated */
  final int     casFeatCode_element;
  /** @generated */ 
  public int getElement(int addr) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "org.apache.uima.NGram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_element);
  }
  /** @generated */    
  public void setElement(int addr, int v) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "org.apache.uima.NGram");
    ll_cas.ll_setRefValue(addr, casFeatCode_element, v);}
    
   /** @generated */
  public int getElement(int addr, int i) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "org.apache.uima.NGram");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_element), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_element), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_element), i);
  }
   
  /** @generated */ 
  public void setElement(int addr, int i, int v) {
        if (featOkTst && casFeat_element == null)
      jcas.throwFeatMissing("element", "org.apache.uima.NGram");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_element), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_element), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_element), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_casProcessId = jcas.getRequiredFeatureDE(casType, "casProcessId", "uima.cas.String", featOkTst);
    casFeatCode_casProcessId  = (null == casFeat_casProcessId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_casProcessId).getCode();

 
    casFeat_element = jcas.getRequiredFeatureDE(casType, "element", "uima.cas.FSArray", featOkTst);
    casFeatCode_element  = (null == casFeat_element) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_element).getCode();

  }
}



    