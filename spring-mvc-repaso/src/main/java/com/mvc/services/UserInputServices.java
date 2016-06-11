package com.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dto.UserInputDto;
import com.mvc.dto.UserOutputDto;
import com.mvc.repository.UserInputsRepository;
import com.mvc.vo.VoUserInput;
import com.mvc.vo.VoUserOutput;

@Service
public class UserInputServices {

	@Autowired
	UserInputsRepository userInputsRepository;

    
	public UserOutputDto getUserDataByCountry(UserInputDto mUserInputDto) {

		if ("Francia".equals(mUserInputDto.getCountry())) {
			System.out.println("el usuario ha dicho por su InputDto que es frances");

			// userInputsRepository.CargarVO1(getVoUserInputFromDTO(mUserInputDto));

			VoUserOutput userOutputVO = userInputsRepository.CargarVO1(getVoUserInputFromDTO(mUserInputDto));

			// getDTOUserOutputFromVO(userOutputVO);

			return getDTOUserOutputFromVO(userOutputVO);

		} else {
			System.out.println("el usuario ha dicho por su InputDto que es de otro lado");

			VoUserOutput userOutputVO = userInputsRepository.CargarVO1(getVoUserInputFromDTO(mUserInputDto));

			return getDTOUserOutputFromVO(userOutputVO);

		}

	}

	// metodo de mapeo de entrada
	private VoUserInput getVoUserInputFromDTO(UserInputDto mUserInputDto) {

		// mapeo del objeto de entrada hacia el Repository

		VoUserInput userVOin = new VoUserInput();

		userVOin.setName(mUserInputDto.getName());
		userVOin.setCity(mUserInputDto.getCity());
		userVOin.setCountry(mUserInputDto.getCountry());
		userVOin.setDepartament(mUserInputDto.getDepartament());

		return userVOin;
	}

	// metodo de mapeo de salida
	private UserOutputDto getDTOUserOutputFromVO(VoUserOutput voUserOutput) {

		// mapeo del objeto de entrada hacia el Repository

		UserOutputDto userOutputDTOSalidaVista = new UserOutputDto();

		userOutputDTOSalidaVista.setCp(voUserOutput.getCp());

		userOutputDTOSalidaVista.setEmail(voUserOutput.getEmail());

		return userOutputDTOSalidaVista;
	}

}
