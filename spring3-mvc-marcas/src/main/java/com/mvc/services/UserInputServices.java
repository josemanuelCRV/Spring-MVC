package com.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.dto.UserInputDto;
import com.mvc.dto.UserOutputDto;
import com.mvc.repository.UserInputsRepositoryAudiList;
import com.mvc.repository.UserInputsRepositoryFord;
import com.mvc.vo.VoUserInput;
import com.mvc.vo.VoUserOutputAudi;
import com.mvc.vo.VoUserOutputFord;

public class UserInputServices {

	@Autowired
	UserInputsRepositoryAudiList repositoryAudiList;
	UserInputsRepositoryFord repositoryFord;
	
	
	public UserOutputDto getCarListByMarca(UserInputDto mUserInputDto) {

		if ("Audi".equalsIgnoreCase(mUserInputDto.getMarca())) {
			System.out.println("Seleccionó Audi");
			VoUserOutputAudi audiOutputVO = repositoryAudiList.CargaVOoutpuAudi(getVoUserInputFromDTO(mUserInputDto));
			return getDTOUserOutputFromVO(audiOutputVO);

		} else if ("Ford".equalsIgnoreCase(mUserInputDto.getMarca())) {
			System.out.println("Seleccionó FORD");
			VoUserOutputFord fordOutputVO = repositoryFord.CargaVOoutpuFord(getVoUserInputFromDTO(mUserInputDto));
			
			  return getDtoUserOutputFromVoFORD(fordOutputVO);
			

		} else {

			return null;
		}

	}

	// metodo de mapeo de entrada
	private VoUserInput getVoUserInputFromDTO(UserInputDto mUserInputDto) {

		// mapeo del objeto de entrada hacia el Repository

		VoUserInput userVOin = new VoUserInput();

		userVOin.setMarca(mUserInputDto.getMarca());

		return userVOin;
	}

	// metodo de mapeo de salida para AUDI
	private UserOutputDto getDTOUserOutputFromVO(VoUserOutputAudi voOutputaudi) {

		// mapeo del objeto de entrada hacia el Repository

		UserOutputDto userOutputDTOSalidaVista = new UserOutputDto();

		userOutputDTOSalidaVista.setModelo(voOutputaudi.getModelo());

		userOutputDTOSalidaVista.setMatricula(voOutputaudi.getMatricula());

		return userOutputDTOSalidaVista;

	}
	
	
	// metodo de mapeo de salida para FORD
		private UserOutputDto getDtoUserOutputFromVoFORD(VoUserOutputFord voOutputford) {

			// mapeo del objeto de entrada hacia el Repository

			UserOutputDto userOutputDTOSalidaVista = new UserOutputDto();

			userOutputDTOSalidaVista.setModelo(voOutputford.getModelo());

			userOutputDTOSalidaVista.setMatricula(voOutputford.getMatricula());

			return userOutputDTOSalidaVista;

		}
	
	
	
	
	

}
