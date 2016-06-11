package com.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.mvc.dto.UserInputDto;
import com.mvc.dto.UserOutputDto;
import com.mvc.repository.UserInputsRepositoryAudiList;
import com.mvc.vo.VoUserInput;
import com.mvc.vo.VoUserOutputAudi;

public class UserInputServices {

	@Autowired
	UserInputsRepositoryAudiList repositoryAudiList;
	// carform

	public UserOutputDto getCarListByMarca(UserInputDto mUserInputDto) {

		if ("Audi".equalsIgnoreCase(mUserInputDto.getMarca())) {
			System.out.println("Seleccionó Audi");

			VoUserOutputAudi audiOutputVO = repositoryAudiList.CargaVOoutpuAudi(getVoUserInputFromDTO(mUserInputDto));

			return getDTOUserOutputFromVO(audiOutputVO);

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

	// metodo de mapeo de salida
	private UserOutputDto getDTOUserOutputFromVO(VoUserOutputAudi voOutputaudi) {

		// mapeo del objeto de entrada hacia el Repository

		UserOutputDto userOutputDTOSalidaVista = new UserOutputDto();

		userOutputDTOSalidaVista.setModelo(voOutputaudi.getModelo());

		userOutputDTOSalidaVista.setMatricula(voOutputaudi.getMatricula());

		return userOutputDTOSalidaVista;

	}

}
