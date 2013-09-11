
/* First created by JCasGen Wed Sep 11 12:41:27 EDT 2013 */
package uima;

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
 * Updated by JCasGen Wed Sep 11 12:41:27 EDT 2013
 * @generated */
public class AnswerScore_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerScore_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerScore_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerScore(addr, AnswerScore_Type.this);
  			   AnswerScore_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerScore(addr, AnswerScore_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerScore.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("uima.AnswerScore");
 
  /** @generated */
  final Feature casFeat_casProcessorId;
  /** @generated */
  final int     casFeatCode_casProcessorId;
  /** @generated */ 
  public String getCasProcessorId(int addr) {
        if (featOkTst && casFeat_casProcessorId == null)
      jcas.throwFeatMissing("casProcessorId", "uima.AnswerScore");
    return ll_cas.ll_getStringValue(addr, casFeatCode_casProcessorId);
  }
  /** @generated */    
  public void setCasProcessorId(int addr, String v) {
        if (featOkTst && casFeat_casProcessorId == null)
      jcas.throwFeatMissing("casProcessorId", "uima.AnswerScore");
    ll_cas.ll_setStringValue(addr, casFeatCode_casProcessorId, v);}
    
  
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public int getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "uima.AnswerScore");
    return ll_cas.ll_getIntValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, int v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "uima.AnswerScore");
    ll_cas.ll_setIntValue(addr, casFeatCode_score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerScore_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_casProcessorId = jcas.getRequiredFeatureDE(casType, "casProcessorId", "uima.cas.String", featOkTst);
    casFeatCode_casProcessorId  = (null == casFeat_casProcessorId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_casProcessorId).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Integer", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

  }
}



    